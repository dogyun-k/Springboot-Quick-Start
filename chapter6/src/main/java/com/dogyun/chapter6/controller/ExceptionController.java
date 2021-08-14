package com.dogyun.chapter6.controller;

import java.sql.SQLException;

import com.dogyun.chapter6.exception.BoardNotFoundException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionController {

    @RequestMapping(value = "/boardError")
    public String boardError() {
        throw new BoardNotFoundException("검색된 글이 없습니다.");
    }

    @RequestMapping(value = "/illegalArgumentError")
    public String illegalArgumentError() {
        throw new IllegalArgumentException("부적절한 인자가 전달되었습니다.");
    }

    @RequestMapping(value = "/sqlError")
    public String sqlError() throws SQLException {
        throw new SQLException("SQL 구문에 오류가 있습니다.");
    }

    @ExceptionHandler(SQLException.class)
    public String numberFormatError(SQLException exception, Model model) {
        model.addAttribute("exception", exception);
        return "errors/sqlError";
    }
}
