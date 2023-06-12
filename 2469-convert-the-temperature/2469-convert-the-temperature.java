class Solution {
    public double[] convertTemperature(double celsius) {
        
        double Kelvin = 0.0;
        double Fah = 0.0;
        
        Kelvin = celsius + 273.15;
        Fah = (celsius*1.8) + 32.0;
        
        double[] ans = new double[2];
        ans[0] = Kelvin;
        ans[1] = Fah;
        
        return ans;
    }
}