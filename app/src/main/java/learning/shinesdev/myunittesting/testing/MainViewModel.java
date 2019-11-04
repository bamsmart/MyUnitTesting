package learning.shinesdev.myunittesting.testing;

import learning.shinesdev.myunittesting.model.CuboidModel;

public class MainViewModel {
    private final CuboidModel cuboidModel;

    public MainViewModel(CuboidModel cuboidModel) {
        this.cuboidModel = cuboidModel;
    }

    public double getKeliling(double p, double l, double t) {
        return cuboidModel.getKeliling(p, l, t);
    }
    
    public double getLuas(double p, double l, double t) {
        return cuboidModel.getLuas(p,l,t);
    }
    public double getVolume(double p, double l, double t) {
        return cuboidModel.getVolume(p, l, t);
    }
}
