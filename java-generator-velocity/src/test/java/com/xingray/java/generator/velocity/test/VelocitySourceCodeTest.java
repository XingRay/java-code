package com.xingray.java.generator.velocity.test;

import com.xingray.java.generator.velocity.VelocitySourceCode;
import com.xingray.java.util.DateTimeUtil;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class VelocitySourceCodeTest {
    @Test
    public void codeGeneratingTest(){
        HashMap<String, Object> map = new HashMap<>();

        map.put("package", "com.xingray.test");
        map.put("moduleName", "entity");
        map.put("comment", "this code is generated by velocity");
        map.put("author", "leixing");
        map.put("email", "leixing1012@qq.com");
        map.put("datetime", DateTimeUtil.todayToDateString(DateTimeUtil.DEFAULT_DATE_PATTERN, DateTimeUtil.ZONE_ID_BEIJING));
        map.put("tableName", "tb_user");
        map.put("className", "User");

        ArrayList<Column> columnList = new ArrayList<>(List.of(new Column("Long", "id", "id"),
                new Column("String", "username", "username"),
                new Column("Integer", "age", "age")));

        map.put("columns", columnList);

        VelocitySourceCode userEntity = new VelocitySourceCode("UserEntity", "Entity.java.vm", map);
        try {
            userEntity.get().write(new File("target/generated-codes"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
