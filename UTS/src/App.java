public class App {
    public static void main(String[] args) throws Exception {
        // a. 1 instance yang hanya anggota (isikan nama dan noAnggota)
        Anggota ayut = new Anggota("Ayut", "01");
        ayut.display();
        System.out.println("#################################");
        // b. 1 instance ketua pengurus (isikan nama, noAnggota dan periode kepengurusan)
        Ketua ary = new Ketua("Ary", "02", "2019 / 2020");
        ary.display();
        
        System.out.println("#################################");
        // c. 1 instance ketua panitia (isikan nama, noAnggota dan periode kepengurusan)
        KetuaPanitia rayhan = new KetuaPanitia("Rayhan", "03", "2020 / 2021");
        rayhan.display();
    }
}