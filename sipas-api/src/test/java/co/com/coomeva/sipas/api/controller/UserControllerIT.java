package co.com.coomeva.sipas.api.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.ws.rs.core.MediaType;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.DEFINED_PORT)
public class UserControllerIT {
	
	private static final Long INFO_ID_1234 = 7127329l;

    @Autowired
    protected WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders
                .webAppContextSetup(this.webApplicationContext)
                .build();
    }
        
	@Test
    public void getProteccionesByAsonumint() throws Exception{
    	String jsonExpected = "{\"id\":1234,\"info\":\"Info 1234\",\"creationDateTime\":\"2001-12-12T13:40:30\"}";
    	
    	mockMvc.perform(get("/protecciones/list/{asociado}", INFO_ID_1234))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect((content().string(jsonExpected)));        		
    }

    /*
    @Test
    public void getInfo_ShouldReturnCorrectInfo() throws Exception {
        String jsonExpected = "{\"id\":1234,\"info\":\"Info 1234\",\"creationDateTime\":\"2001-12-12T13:40:30\"}";

        mockMvc.perform(get("/api/info/{id}", INFO_ID_1234))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().string(jsonExpected));
    }

    @Test
    public void postInfo_ShouldReturnCreatedStatusAndCorrectInfo() throws Exception {
        String jsonExpected = "{\"id\":1234,\"info\":\"Info 1234 New\",\"creationDateTime\":\"2015-10-25T19:13:21\"}";

        mockMvc.perform(post("/api/info/")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"info\":\"Info 1234 New\",\"creationDateTime\":\"2015-10-25T19:13:21\"}"))
                .andExpect(status().isCreated())
                .andExpect(content().string(jsonExpected));        
    }

    @Test
    public void deleteInfo_ShouldReturnNoContentStatus() throws Exception {
        mockMvc.perform(delete("/api/info/{id}", INFO_ID_1234))
                .andExpect(status().isNoContent());
    }
    */
}
