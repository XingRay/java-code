package com.xingray.java.generator.velocity;

import com.xingray.code.common.FileTreeNode;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import java.io.StringWriter;
import java.util.Map;
import java.util.Properties;
import java.util.function.Supplier;

public class VelocitySourceCode implements Supplier<FileTreeNode> {

    private final VelocityContext context;
    private final Template template;
    private final String fileName;

    static {
        Properties prop = new Properties();
        prop.put("resource.loader.file.class", ClasspathResourceLoader.class.getName());
        Velocity.init(prop);
    }

    public VelocitySourceCode(String fileName, String templateName, Map<String, Object> paramMap) {
        this.fileName = fileName;
        context = new VelocityContext(paramMap);
        template = Velocity.getTemplate(templateName);
    }

    @Override
    public FileTreeNode get() {
        StringWriter sw = new StringWriter();
        template.merge(context, sw);
        return FileTreeNode.createNode(fileName, sw.toString());
    }
}
