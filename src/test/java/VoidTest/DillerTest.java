package VoidTest;

import Entity.CarGenerator;
import Entity.EngineGenerator;
import com.company.builder.OutputBuilder;
import com.company.car.Car;
import com.company.diller.Diller;
import com.company.service.CarServise;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DillerTest {

    @InjectMocks
    private Diller diller;

    @Mock
    private CarServise carServise;


    @Test
    public void findCarsTest() {
        String model = "Test";
        List<Car> cars = List.of(CarGenerator.getCar(EngineGenerator.getEngine()));

        try (MockedStatic<OutputBuilder> outputBuilder = mockStatic(OutputBuilder.class)) {

            when(carServise.findCars(model)).thenReturn(cars);

            diller.findCars(model);

            outputBuilder.verify(() -> OutputBuilder.showAllInfo(cars));
        }
    }
}
