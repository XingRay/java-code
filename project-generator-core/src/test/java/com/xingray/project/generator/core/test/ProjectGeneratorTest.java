package com.xingray.project.generator.core.test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.FieldAccessExpr;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.xingray.code.common.FileTreeNode;
import com.xingray.project.generator.core.entity.Project;
import com.xingray.project.generator.core.generator.impl.ProjectGeneratorImpl;
import com.xingray.project.generator.core.build.maven.JacksonXmlConverter;
import com.xingray.project.generator.core.build.maven.Maven;
import com.xingray.project.generator.core.build.maven.MavenFileGenerator;
import com.xingray.project.maven.model.MavenProject;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class ProjectGeneratorTest {
    @Test
    public void helloWorldProjectGenerateTest() {
        String parentPath = "target/generated-projects";
        String group = "com.xingray";
        String projectName = "generator-test01";
        String version = "1.0.0";

        Project project = new Project();
        project.setLocation(new File(parentPath, projectName));
        project.setName(projectName);

        Maven maven = new Maven();
        project.setBuildSystem(maven);
        maven.setMavenProject(new MavenProject(group, projectName, version));

        XmlMapper xmlMapper = XmlMapper.builder()
                .configure(MapperFeature.USE_STD_BEAN_NAMING, true)
                .defaultUseWrapper(true)
                .configure(SerializationFeature.INDENT_OUTPUT, true)
                .serializationInclusion(JsonInclude.Include.NON_NULL)
                .build();

        JacksonXmlConverter jacksonXmlConverter = new JacksonXmlConverter(xmlMapper);
        maven.setMavenFileGenerator(new MavenFileGenerator(jacksonXmlConverter));

        project.setProjectGenerator(new ProjectGeneratorImpl());
        FileTreeNode projectRootTree = project.generate();

        try {
            projectRootTree.write(project.getLocation().getParentFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

//        project.build();
//        project.run();
//        project.clean();
    }

    private static String generateCode(String packageName, String className) {
        CompilationUnit cu = new CompilationUnit();

        // Add package declaration
        cu.setPackageDeclaration(packageName);


        ClassOrInterfaceDeclaration mainClass = cu.addClass(className).setPublic(true);
        MethodDeclaration mainMethod = mainClass.addMethod("main", Modifier.Keyword.PUBLIC, Modifier.Keyword.STATIC);
        mainMethod.setType(void.class);
        mainMethod.addParameter(String[].class, "args");

        BlockStmt body = new BlockStmt();

        ExpressionStmt statement = new ExpressionStmt();
        MethodCallExpr methodCallExpression = new MethodCallExpr(new FieldAccessExpr(new NameExpr("System"), "out"), "println", NodeList.nodeList(new StringLiteralExpr("hello world")));
        statement.setExpression(methodCallExpression);
        body.addStatement(statement);
        mainMethod.setBody(body);

        return cu.toString();
    }
}
