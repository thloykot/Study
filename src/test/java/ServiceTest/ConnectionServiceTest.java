package ServiceTest;

import com.company.dao.DBConnectionDao;
import com.company.service.Impl.DBConnectionServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ConnectionServiceTest {

    @InjectMocks
    private DBConnectionServiceImpl dbConnectionService;

    @Mock
    private DBConnectionDao dbConnectionDao;

    @Test
    public void connectionTest() {
        when(dbConnectionDao.isConnected()).thenReturn(true);

        assertThat(dbConnectionService.isConnected(), is(true));
    }
}
