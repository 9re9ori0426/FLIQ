package com.fliq.fliq;

import org.apache.ibatis.session.SqlSession;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class TestDAO {

    public static void selectAllTest(HttpServletRequest request) {
        try (SqlSession ss = MyBatisDB.connect()) {
            List<TestDTO> tests = ss.selectList("fliqSql.selectAllTest");
            request.setAttribute("tests", tests);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
