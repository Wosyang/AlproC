import javax.swing.JOptionPane;

public class JavaLibs5026211169 {
        public static void main(String[] args) {

                // Perkenalan

                JOptionPane.showMessageDialog(null, "ZWOOOOSH", "Ini Tittle", 2);
                JOptionPane.showMessageDialog(null,
                                "Kamu tiba tiba terbangun di ruangan yang sangat carah dan sangat luas",
                                "Ini masih Tittle", 1);
                JOptionPane.showMessageDialog(null,
                                "Kau melihat sesosok makhluk putih yang tidak terlalu jelas mendekatimu",
                                "Masih Tittle kok", 1);
                String nama = (String) JOptionPane.showInputDialog(null,
                                "HWAALOOO!!!!!!!, \nIya g jelas emang, btw kalo boleh tau namamu siapa?", "Namamu?");
                JOptionPane.showMessageDialog(null, "oh hallo " + nama.toUpperCase()
                                + ", aku mau nannya nannya beberapa hal, alasannya ya... karena kamu tau kan ini program apa");

                // Input Variabel

                String olahraga = (String) JOptionPane.showInputDialog(null,
                                "Gerakan olahraga yang paling kamu tidak sukai, itu gerakan apa?", "Kayang misalnya");
                String tubuhideal = (String) JOptionPane.showInputDialog(null, "Bentuk tubuh idealmu",
                                "Kurus misalnya");
                String hewan = (String) JOptionPane.showInputDialog(null, "Kalo hewan kesukaanmu?",
                                "Misal kucing gitu");
                String tubuhhewan = (String) JOptionPane.showInputDialog(null,
                                "Sorry kalo agak g jelas, Tapi bagian tubuh yang paling kamu sukai dari hewan itu apa?",
                                "Misal bulu");
                String dangdut = (String) JOptionPane.showInputDialog(null,
                                "Kata kata dangdut kesukaanmu\n(kalo g pernah denger dangdut, boleh pakai kata kata semangat)",
                                "Aselole Asoygeboy");
                String kegiatan = (String) JOptionPane.showInputDialog(null, "Kegiatan sehari hari",
                                "Ngepel");
                String lokasi = (String) JOptionPane.showInputDialog(null, "Lokasi Alam yang paling kamu suka",
                                "Misal Ladang gandum");
                String motivasi = (String) JOptionPane.showInputDialog(null, "Orang yang kamu kagumi",
                                "misal mario teguh gitu");

                // Input Angka yang perlu pengecekan ulang

                int tipe_lokasi = 0;
                while (tipe_lokasi > 3 || tipe_lokasi < 1) {
                        String strtipe_lokasi = (String) JOptionPane.showInputDialog(null,
                                "Kasih tau dong jenis lokasinya tadi apa? \n([1. Darat] [2. Udara] [3. Laut]",
                                "1");
                        tipe_lokasi = Integer.parseInt(strtipe_lokasi);

                        if (tipe_lokasi > 3 || tipe_lokasi < 1) {
                                JOptionPane.showMessageDialog(null,
                                                "ehm.. sorry kamu salah isi, harus 1 / 2 / 3",
                                        "Tittlenya balik lagi euy", 01);
                                }
                        }

                int langkah = 0;
                while (langkah > 10 || langkah < 1) {
                String str_angka_random = (String) JOptionPane.showInputDialog(null,
                                "JAWAB CEPAT!!! \nPILIH ANGKA 1 SAMPE 10",
                                "3");
                        langkah = Integer.parseInt(str_angka_random);
                        
                        if (langkah > 10 || langkah < 1) {
                                JOptionPane.showMessageDialog(null,
                                                "1 - 10 euy, dan jangan ada komanya",
                                                "yo wassup!, still being tittle here", 0);
                        }  
                }     

                int hp = 0;
                while (hp > 1000 || hp < 10) {
                String strhp = (String) JOptionPane.showInputDialog(null,
                                "JAWAB CEPAT!!! \nPILIH ANGKA 100 SAMPE 1000",
                                "300");
                        hp = Integer.parseInt(strhp);

                        if (hp > 1000 || hp < 10) {
                                JOptionPane.showMessageDialog(null,
                                                "NOOOOO " + hp + " bukan nilai 100 - 1000",
                                                "being tittle is my passion", 0);
                        } 
                }      
                Double atkbuff = -1.0;
                while (atkbuff > 1 || atkbuff < 0) {
                String stratk = (String) JOptionPane.showInputDialog(null,
                                "Angka Antara 0 - 1",
                                "0.5");
                atkbuff = Double.parseDouble(stratk);
                        
                        if (atkbuff > 1 || atkbuff < 0) {
                                JOptionPane.showMessageDialog(null,
                                                "Nononono, sorry tapi " + stratk + "bukan angka valid :(",
                                                "Somewhat, im still a tittle", 0);
                        }
                }
                // Kalkulasi
                
                int atkraw = 10;
                int jumlahserangan = hp / atkraw;
                Double atkterbuff = (atkraw * atkbuff) + atkraw;
                Double jumlahserangan2 = hp / ( 2 *  atkterbuff);
                Math.ceil(jumlahserangan2);

                // Hasil Akhir

                if (tipe_lokasi == 1) {
                        JOptionPane.showMessageDialog(null, "ZWOOOOOOOSH", "sumpah g jelas", 2);
                        JOptionPane.showMessageDialog(null,
                                        "Kamu terbangun di " + lokasi.toUpperCase()
                                                        + ", kamu tersadar kalau ini bukan di bumi"
                                                        + "\nkarena kamu melihat seekor " + hewan.toUpperCase()
                                                        + " yang memiliki " + tubuhhewan.toUpperCase()
                                                        + " yang berbentuk spiral"
                                                        + "\ndan " + hewan.toUpperCase() + " itu sedang "
                                                        + olahraga.toUpperCase()
                                                        + " yang dimana hal tersebut merupakan hal yang tidak pernah terjadi di duniamu"
                                                        + "\nsetelah benar benar tersadar sepenuhnya kamu akhirnya memulai berjalan tanpa arah"
                                                        + "\nsetelah " + langkah
                                                        + " jam berjalan, kamu menemukan sebuah kota"
                                                        + "\ndiatas pintu masuk kota itu, tertuliskan "
                                                        + dangdut.toUpperCase() +
                                                        "\ndan kamu melihat penduduknya terlihat sangat "
                                                        + dangdut.toUpperCase() +
                                                        "\nkamu memutuskan untuk masuk ke kota tersebut, kamu mendatangi sebuah bangunan yang kamu anggap tidak asing"
                                                        + "\nKetika didalam bangunan tersebut, tiba tiba kamu dihadang oleh seorang pria yang terlihat "
                                                        + tubuhideal.toUpperCase() +
                                                        "\ndia tiba tiba berkata " + dangdut.toUpperCase() + " Gordon"
                                                        + "\nlalu kamu menjawab balik dengan " + dangdut.toUpperCase()
                                                        + " " + nama.toUpperCase() +
                                                        "\nPria tersebut tersenyum dan kalian berjabat tangan"
                                                        + "\nsetelah perkenalan yang tidak jelas itu, kamu menuju ke resepsionis dan mendaftarkan dirimu sebagai PE"
                                                        + kegiatan.toUpperCase() +
                                                        "\ndan mulai detik ini kamu memulai karirmu sebagai seorang PE"
                                                        + kegiatan.toUpperCase() + " didunia fantasi ini.",
                                        "sorry lagi g ada ide yang bagus :\"", 1);
                }

                if (tipe_lokasi == 2) {
                        JOptionPane.showMessageDialog(null, "ZWOOOOOOOSH", "sumpah g jelas", 2);
                        JOptionPane.showMessageDialog(null,
                                                        "Kamu terbangun di " + lokasi.toUpperCase()
                                                        + " dan kamu jatuh bebas dari atas, dan mendarat di tumpukan jerami"
                                                        + "\n setelah bebera menit kamu menenangkan pikiran, kamu tersadar kalau ini bukan di bumi"
                                                        + "\nkarena kamu melihat seekor " + hewan.toUpperCase()
                                                        + " yang memiliki " + tubuhhewan.toUpperCase()
                                                        + " yang berbentuk spiral"
                                                        + "\ndan " + hewan.toUpperCase() + " itu sedang "
                                                        + olahraga.toUpperCase()
                                                        + " yang dimana hal tersebut merupakan hal yang tidak pernah terjadi di duniamu"
                                                        + "\nsetelah benar benar tersadar sepenuhnya kamu akhirnya memulai berjalan tanpa arah"
                                                        + "\nsetelah " + langkah
                                                        + " jam berjalan, kamu menemukan sebuah kota"
                                                        + "\ndiatas pintu masuk kota itu, tertuliskan "
                                                        + dangdut.toUpperCase() +
                                                        "\ndan kamu melihat penduduknya terlihat sangat "
                                                        + dangdut.toUpperCase() +
                                                        "\nkamu memutuskan untuk masuk ke kota tersebut, kamu mendatangi sebuah bangunan yang kamu anggap tidak asing"
                                                        + "\nKetika didalam bangunan tersebut, tiba tiba kamu dihadang oleh seorang pria yang terlihat "
                                                        + tubuhideal.toUpperCase() +
                                                        "\ndia tiba tiba berkata " + dangdut.toUpperCase() + " Gordon"
                                                        + "\nlalu kamu menjawab balik dengan " + dangdut.toUpperCase()
                                                        + " " + nama.toUpperCase() +
                                                        "\nPria tersebut tersenyum dan kalian berjabat tangan"
                                                        + "\nsetelah perkenalan yang tidak jelas itu, kamu menuju ke resepsionis dan mendaftarkan dirimu sebagai PE"
                                                        + kegiatan.toUpperCase() +
                                                        "\ndan mulai detik ini kamu memulai karirmu sebagai seorang PE"
                                                        + kegiatan.toUpperCase() + "didunia fantasi ini.",
                                         "sorry lagi g ada ide yang bagus :\"", 1);
                }

                if (tipe_lokasi == 3) {
                        JOptionPane.showMessageDialog(null, "ZWOOOOOOOSH", "sumpah g jelas", 2);
                        JOptionPane.showMessageDialog(null,
                                                        "Kamu terbangun di " + lokasi.toUpperCase()
                                                        + " kamu seketika panik dan mencoba berenang ke daratan"
                                                        + "setelah kamu menenangkan pikiran dan mengeringkan pakaianmu, kamu tersadar kalau ini bukan di bumi"
                                                        + "\nkarena kamu melihat seekor " + hewan.toUpperCase()
                                                        + " yang memiliki " + tubuhhewan.toUpperCase()
                                                        + " yang berbentuk spiral"
                                                        + "\ndan " + hewan.toUpperCase() + " itu sedang "
                                                        + olahraga.toUpperCase()
                                                        + " yang dimana hal tersebut merupakan hal yang tidak pernah terjadi di duniamu"
                                                        + "\nsetelah benar benar tersadar sepenuhnya kamu akhirnya memulai berjalan tanpa arah"
                                                        + "\nsetelah " + langkah
                                                        + " jam berjalan, kamu menemukan sebuah kota"
                                                        + "\ndiatas pintu masuk kota itu, tertuliskan "
                                                        + dangdut.toUpperCase() +
                                                        "\ndan kamu melihat penduduknya terlihat sangat "
                                                        + dangdut.toUpperCase() +
                                                        "\nkamu memutuskan untuk masuk ke kota tersebut, kamu mendatangi sebuah bangunan yang kamu anggap tidak asing"
                                                        + "\nKetika didalam bangunan tersebut, tiba tiba kamu dihadang oleh seorang pria yang terlihat "
                                                        + tubuhideal.toUpperCase() +
                                                        "\ndia tiba tiba berkata " + dangdut.toUpperCase() + " Gordon"
                                                        + "\nlalu kamu menjawab balik dengan " + dangdut.toUpperCase()
                                                        + " " + nama.toUpperCase() +
                                                        "\nPria tersebut tersenyum dan kalian berjabat tangan"
                                                        + "\nsetelah perkenalan yang tidak jelas itu, kamu menuju ke resepsionis dan mendaftarkan dirimu sebagai PE"
                                                        + kegiatan.toUpperCase() +
                                                        "\ndan mulai detik ini kamu memulai karirmu sebagai seorang PE"
                                                        + kegiatan.toUpperCase() + " didunia fantasi ini.",
                                        "sorry lagi g ada ide yang bagus :\"", 1);
                }

                JOptionPane.showMessageDialog(null,
                                        "Kamu mendapat tugas pertamamu, yaitu membantu mengamankan jalan utama, dengan mengeliminasi "
                                        + hewan.toUpperCase() + olahraga.toUpperCase() +
                                        "\nSetelah beberapa langkah kamu telah sampai di lokasi " + hewan.toUpperCase() + " " + olahraga.toUpperCase()+" berada. " 
                                        +"\nBelum lama kamu menunggu, akhirnya kamu bertemu dengan " + hewan.toUpperCase()+ olahraga.toUpperCase()
                                        +"\nTiba tiba suara music retro terdengar di telingamu Secara ajaib kamu sedang berada di \"Battle Phase\""
                                        +"\nterlihat \"Health Point\" " + hewan.toUpperCase() + " " + olahraga.toUpperCase() + " sejumlah "+ hp +
                                        " \ndengan nilai atkmu sebesar " + atkraw + " kamu perlu menyerang " + jumlahserangan+ " kali untuk memenangkan battle ini "
                                        + "\nkamu meluncurkan seranganmu dan " + hewan.toUpperCase() + " " + olahraga.toUpperCase() + " meluncurkan serangannya juga "
                                        + "\nkamu masih bisa bertahan dikarenakan kamu membawa cukup health potion memulihkan Health Pointmu berkali kali "
                                        + "\nDisaat pertengahan battle, kamu teringat kata kata motivasi dari " + motivasi.toUpperCase() +
                                        "\nHal tersebut membuat atkmu meningkat menjadi " + atkterbuff + " sehingga kurang " + jumlahserangan2 + " serangan lagi utnuk memenangkan battle ini "
                                        + "\nSetelah beberapa menit berlalu akhirnya kamu memberikan serangan terakhir dan kamu berhasil memenangkan pertarungan "
                                        + "\nkamu membawa " + hewan.toUpperCase() + olahraga.toUpperCase() + " yang sudah kamu eliminasi dan kembali ke kota "
                                        + "\nsaat ditengah kota ada seorang anak kecil yang melihatmu dan menjulukimu \"" + hewan.toUpperCase() + " " + olahraga.toUpperCase() + " SLAYER\" "
                                        + "\ndan mulai saat itu kamu mempunyai julukan baru. yaitu " +nama.toUpperCase()+ " THE " + hewan.toUpperCase() + " " + olahraga.toUpperCase() + " SLAYER\" ",
                                        "masih lanjut buat menuhi kriteria", 1);
                JOptionPane.showMessageDialog(null, "Bersambung??...", "Nah Kelar", 3);
                
                
        }
}
