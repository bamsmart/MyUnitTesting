package learning.shinesdev.myunittesting.testing;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import learning.shinesdev.myunittesting.model.CuboidModel;

import static org.junit.Assert.*;

public class MainViewModelTest {
    private MainViewModel mainViewModel;
    private CuboidModel cuboidModel;

    private final double dummyLength = 12.0;
    private final double dummyWidth = 7.0;
    private final double dummyHeight = 6.0;

    private final double dummyVolume = 504.0;
    private final double dummyCircumference = 2016.0;
    private final double dummySurfaceArea = 396.0;

    @Before
    public void before() {
        cuboidModel = Mockito.mock(CuboidModel.class);
        mainViewModel = new MainViewModel(cuboidModel);
    }

    @Test
    public void testVolume() {
        cuboidModel = new CuboidModel();
        mainViewModel = new MainViewModel(cuboidModel);

        double volume = mainViewModel.getVolume(dummyLength, dummyWidth, dummyHeight);
        assertEquals(dummyVolume, volume, 0.0001);
    }

    @Test
    public void testLuas() {
        cuboidModel = new CuboidModel();
        mainViewModel = new MainViewModel(cuboidModel);

        double luas = mainViewModel.getLuas(dummyLength, dummyWidth, dummyHeight);
        assertEquals(dummySurfaceArea, luas, 0.0001);
    }

    @Test
    public void testMockVolume() {
        Mockito.when(mainViewModel.getVolume(dummyLength, dummyWidth, dummyHeight)).thenReturn(dummyVolume);
        double volume = mainViewModel.getVolume(dummyLength, dummyWidth, dummyHeight);
        Mockito.verify(cuboidModel).getVolume(dummyLength, dummyWidth, dummyHeight);
        assertEquals(dummyVolume, volume, 0.0001);
    }

    @Test
    public void testMockCircumference() {
        Mockito.when(mainViewModel.getKeliling(dummyLength, dummyWidth, dummyHeight)).thenReturn(dummyCircumference);
        double keliling = mainViewModel.getKeliling(dummyLength, dummyWidth, dummyHeight);
        Mockito.verify(cuboidModel).getKeliling(dummyLength, dummyWidth, dummyHeight);
        assertEquals(dummyCircumference, keliling, 0.0001);
    }

    @Test
    public void testMockSurfaceArea() {
        Mockito.when(mainViewModel.getLuas(dummyLength, dummyWidth, dummyHeight)).thenReturn(dummySurfaceArea);
        double luas = mainViewModel.getLuas(dummyLength, dummyWidth, dummyHeight);
        Mockito.verify(cuboidModel).getLuas(dummyLength, dummyWidth, dummyHeight);
        assertEquals(dummySurfaceArea, luas, 0.0001);
    }
}