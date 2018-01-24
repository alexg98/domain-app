package co.com.coomeva.sipas.core.service.protecciones;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(MockitoJUnitRunner.class)
public class ProteccionServiceImplTest {
	
	@Mock
    DataService dataServiceMock;
    
    @InjectMocks
    BusinessService businessImpl;
    
    @Test
    public void testFindTheGreatestFromAllData() {   			
		
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,15,3});
        assertEquals(24, businessImpl.findTheGreatestFromAllData());
    }
    
    @Test
    public void testFindTheGreatestFromAllData_ForOneValue() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});
        assertEquals(15, businessImpl.findTheGreatestFromAllData());
    }
    
    @Test
    public void testFindTheGreatestFromAllData_NoValues() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
        assertEquals(Integer.MIN_VALUE, businessImpl.findTheGreatestFromAllData());
    }
}

class SomeBusinessImpl {
	
    private DataService dataService;
    
    public SomeBusinessImpl(DataService dataService) {
        super();
        this.dataService = dataService;
    }
    
    public int findTheGreatestFromAllData(){
    	return 0;
    }
}

@Repository
class DataService {
    public int[] retrieveAllData() {
        // Some dummy data
        // Actually this should talk to some database to get all the data
        return new int[] {1,2,3,4,5};
    }
}

@Service
class BusinessService {
	
    private DataService dataService;
    
    public BusinessService(DataService dataService) {
        super();
        this.dataService = dataService;
    }
    
    public int findTheGreatestFromAllData() {
        int[] data = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;
        for (int value: data) {
            if (value > greatest) {
                greatest = value;
            }
        }
        return greatest;
    }
}


@RunWith(SpringRunner.class)
@SpringBootTest
class BusinessServicesMockSpringContextTest {
    @MockBean
    DataService dataServiceMock;
    @Autowired
    BusinessService businessImpl;
    @Test
    public void testFindTheGreatestFromAllData() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,15,3});
        assertEquals(24, businessImpl.findTheGreatestFromAllData());
    }
    @Test
    public void testFindTheGreatestFromAllData_ForOneValue() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});
        assertEquals(15, businessImpl.findTheGreatestFromAllData());
    }
    @Test
    public void testFindTheGreatestFromAllData_NoValues() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
        assertEquals(Integer.MIN_VALUE, businessImpl.findTheGreatestFromAllData());
    }
}