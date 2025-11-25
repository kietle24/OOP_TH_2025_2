package ck;

public class GiangVienThinhGiang extends GiangVien {

    public  int soTietDay;

    public GiangVienThinhGiang(String maGV, String hoVaTen, String email, int soTietDay) {
        super(maGV, hoVaTen, email);

        if (soTietDay < 0) {
            throw new IllegalArgumentException("soTietDay khong hop le");
        }

       setSoTietDay(soTietDay);
    }

    public int getSoTietDay() {
        return soTietDay;
    }

    public void setSoTietDay(int soTietDay) {
        this.soTietDay = soTietDay;
    }
    

    @Override
    public double linhLuong() {
        double tienLuong = this.soTietDay * DON_GIA_MOI_TIET.getGiaTri();

        if (this.soTietDay >= 50) {
            tienLuong *= 1.1;    // thưởng 10%
        }

        return tienLuong;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | soTietDay: %d", soTietDay);
    }
}
