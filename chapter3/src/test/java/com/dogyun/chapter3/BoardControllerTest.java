package com.dogyun.chapter3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.dogyun.chapter3.service.BoardService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class BoardControllerTest {

    // Mock으로 하는 테스트
    // @Autowired
    // private MockMvc mockMvc;

    // @MockBean
    // private BoardService boardService;

    // @Test
    // public void testHello3() throws Exception {
    //     when(boardService.hello("둘리")).thenReturn("hello : 둘리");

    //     mockMvc.perform(get("/hello").param("name", "둘리")).andExpect(status().isOk())
    //             .andExpect(content().string("hello : 둘리")).andDo(print());
    // }

    // @Test
    // public void testHello1() throws Exception {
    //     mockMvc.perform(get("/hello").param("name", "둘리")).andExpect(status().isOk())
    //             .andExpect(content().string("hello! 둘리")).andDo(print());
    // }

    // // 내장 Tomcat서버로 servlet을 이용한 테스트
    // @Autowired
    // private TestRestTemplate restTemplate;

    // @Test
    // public void testHello2() throws Exception {
    //     String result = restTemplate.getForObject("/hello?name=둘리", String.class);
    //     assertEquals("hello : 둘리", result);
    // }

    // // 객체 리턴 메소드 테스트
    // @Test
    // public void testGetBoard() throws Exception {
    //     BoardVO board = restTemplate.getForObject("/getBoard", BoardVO.class);
    //     assertEquals("dogyun", board.getWriter());
    // }

}
