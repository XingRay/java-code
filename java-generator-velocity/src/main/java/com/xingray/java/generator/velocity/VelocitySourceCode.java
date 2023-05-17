package com.xingray.java.generator.velocity;

import com.xingray.code.common.FileTreeNode;
import com.xingray.java.util.StringUtil;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.StringWriter;
import java.util.Map;
import java.util.Properties;
import java.util.function.Supplier;

public class VelocitySourceCode implements Supplier<FileTreeNode> {

    private final VelocityContext context;
    private final Template template;
    private final String packageName;
    private final String fileName;

    public VelocitySourceCode(Properties properties, String packageName, String fileName, String templateName, Map<String, Object> paramMap) {
        this.fileName = fileName;
        this.packageName = packageName;

        context = new VelocityContext(paramMap);
        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.init(properties);
        template = velocityEngine.getTemplate(templateName);
    }

    @Override
    public FileTreeNode get() {
        StringWriter sw = new StringWriter();
        template.merge(context, sw);
        if (StringUtil.hasText(packageName)) {
            String[] packages = packageName.split("\\.");
            return FileTreeNode.createTree(packages, FileTreeNode.createNode(fileName, sw.toString()));
        } else {
            return FileTreeNode.createNode(fileName, sw.toString());
        }
    }

    public static Properties ofAbsolutePath(String absolutePath) {
        Properties properties = new Properties();
        properties.setProperty("resource.loader.file.path", absolutePath);
        return properties;
    }

    public static Properties ofClassPath(Class cls, String classPath) {
        Properties properties = new Properties();
        String path = cls.getResource(classPath).getPath();
        properties.setProperty("resource.loader.file.path", path);
        return properties;
    }
}
