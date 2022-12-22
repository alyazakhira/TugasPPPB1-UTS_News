package com.example.projectnewsutsrev10;

import java.util.ArrayList;

public class NewsArray{
    ArrayList<News> news;

    public NewsArray() {
        this.news = addData();
    }

    public ArrayList<News> addData(){
        ArrayList<News> newsList = new ArrayList<>();

//        initiate news
        News news1 = new News("3 Sistem Keamanan Terbaik Ini Wajib Dimiliki Aplikasi Mobile","Technology",13, "Dea Duta Aulia","inet.detik.com");
        News news2 = new News("Hore! Avatar Mark Zuckerberg di Metaverse Akhirnya Ada Kakinya","Technology",15,"Fino Yurio Kristo","inet.detik.com");
        News news3 = new News("Begini Cara Menghasilkan Uang dari SnackVideo","Technology",18,"Aisyah Kamaliah","inet.detik.com");
        News news4 = new News("MotoGP Australia 2022 Layaknya Babak Final","Sports",13,"Afif Farhan","sport.detik.com");
        News news5 = new News("Man United Masih Tampil Buruk!","Sports",15,"Lucas Aditya","sport.detik.com");
        News news6 = new News("Rekomendasi TGIPF: Ketum dan Exco PSSI Mundur","Sports",18,"Yanu Ariffin","sport.detik.com");
        News news7 = new News("Sudah 152 Anak kena Gangguan Ginjal Misterius, Kemenkes Lapor WHO!","Health",13,"Nafilah Sri Sagita","health.detik.com");
        News news8 = new News("Viral Kosmetik Gisella Anastasia 'Madame Gie' Masuk Temuan Berbahaya BPOM","Health",15,"Nafilah Sri Sagita","health.detik.com");
        News news9 = new News("Dikaitkan Kasus Lesti Kejora, Apa Itu Stockholm Syndrome?","Health",18,"Suci Risanti Rahmadania","health.detik.com");

//        add news1 content attribute
        news1.content = "Jakarta - Aplikasi mobile dirancang untuk membantu aktivitas sehari-hari. Kendati memudahkan, para pengguna tidak boleh sembarangan dalam memilih aplikasi. Apalagi jika aplikasi yang meminta untuk memasukkan informasi pribadi, maka para pengguna harus waspada.\n" +
                "\n" +
                "Sebelum memasukkan data pribadi, para pengguna harus memastikan aplikasi yang digunakan memiliki sistem keamanan yang mumpuni.\n" +
                "\n" +
                "Dilansir dari iproov, berikut adalah sistem keamanan yang harus dimiliki oleh sebuah aplikasi\n" +
                "\n" +
                "1. PIN\n" +
                "\n" +
                "Personal Identification Number (PIN) merupakan salah satu fitur keamanan yang wajib dimiliki oleh setiap aplikasi. Pasalnya fitur ini mampu meminimalisir orang lain untuk mengakses akun digital yang dimiliki.\n" +
                "\n" +
                "PIN biasanya terdiri dari kombinasi 6 angka atau lebih. Usahakan saat proses pembuatan PIN jangan pernah menggunakan kombinasi angka yang mudah diketahui oleh orang lain, contohnya tanggal kelahiran serta bulan dan tahunnya. Kombinasi PIN tersebut akan mudah terdeteksi oleh orang lain dengan cara melihat biodata para pengguna.\n" +
                "\n" +
                "2. OTP Code\n" +
                "\n" +
                "One Time Passwords (OTP) Code konsepnya tidak jauh berbeda dengan PIN. Pasalnya fitur ini kerap memanfaatkan kombinasi angka untuk membantu para pengguna suatu aplikasi mengakses akun mereka.\n" +
                "\n" +
                "Meskipun begitu, OTP Code dan PIN memiliki perbedaan yang cukup nyentrik. OTP Code biasanya muncul ketika para pengguna melakukan suatu aktivasi. Biasanya saat proses verifikasi, para pengguna akan akan dimintakan untuk memasukkan kode yang dikirim oleh aplikasi melalui pesan singkat SMS.\n" +
                "\n" +
                "Kode tersebut lah yang bisa digunakan oleh para pengguna untuk mengakses akun yang dimiliki. Tak hanya itu, biasanya kode yang dikirim melalui SMS ini memiliki tenggang waktu tidak lama hanya sekitar beberapa detik saja. Jika lewat dari tenggang waktu yang telah ditentukan maka kode dikirim akan hangus.\n" +
                "\n" +
                "Perlu diingat, kode OTP ini harus dirahasiakan dan tidak boleh dikasih tau ke siapa pun agar transaksi aman. Jadi jika ada yang meminta kode OTP-mu, jangan dikasih ya.\n" +
                "\n" +
                "3. Face Verification\n" +
                "\n" +
                "Kalau dibandingkan dengan PIN dan OTP, fitur keamanan face verification tentu memiliki perbedaan yang cukup nyentrik. Pasalnya para pengguna diwajibkan untuk melakukan verifikasi wajah agar akunnya dapat diakses.\n" +
                "\n" +
                "Jika wajah dianggap tidak sesuai, maka sistem akan secara otomatis menolak akses masuk. Oleh karena itu, fitur keamanan ini tergolong cukup aman jika dibandingkan dengan yang lain.";

//        add news2 content attribute
        news2.content = "Jakarta - Mark Zuckerberg mengklaim jagat virtual metaverse akan menjadi masa depan internet. Akan tetapi masih banyak kelemahannya, misalnya yang mencolok, avatar yang ada di platform Horizon Worlds milik Meta, sejauh ini tidak ada kakinya.\n" +
                "\n" +
                "Tentu hal itu membuat avatar di jagat metaverse jadi kurang menarik dan tidak begitu realistis. Padahal Meta selaku induk Facebook sudah menggelontorkan banyak uang demi mengembangkan Metaverse, sampai USD 10 miliar di tahun 2021.\n" +
                "\n" +
                "Tapi akhirnya, Mark Zuckerberg mengumumkan bahwa avatar di Horizon World akan ada kakinya. Statusnya adalah coming soon alias segera datang. Zuckerberg menyatakan membuat kaki avatar tak semudah kelihatannya.\n" +
                "\n" +
                "\"Aku tahu kalian sudah menunggu hal ini. Setiap orang sudah menunggunya. Tapi serius, kaki itu sulit (dibuat), itulah mengapa (avatar di) sistem virtual reality yang lain juga tak ada kakinya,\" cetus Zuck yang dikutip detikINET dari Vox.\n" +
                "\n" +
                "Menciptakan sebuah kaki ternyata memang tak mudah lantaran headset AR/VR baru bisa mengenali pergerakan tubuh bagian atas, bukan bagian bawah. Kini dengan bantuan AI atau kecerdasan buatan, perangkat itu bisa memprediksi di mana posisi kaki.\n" +
                "\n" +
                "Adapun membuat avatar yang realistis memang krusial bagi metaverse, apalagi sejauh ini, bisa dikatakan belum banyak peminatnya. Selain kaki, Meta juga akan memperbaiki tampilan visual avatar sehingga semakin bagus.\n" +
                "\n" +
                "Sejauh ini, pertaruhan Mark Zuckerberg dan perusahaannya Meta yang meyakini metaverse adalah masa depan belum begitu membuahkan hasil. Bahkan harga saham Meta terus melorot semenjak didirikan untuk menjadi induk Facebook.";

//        add news3 content attribute
        news3.content = "Jakarta - SnackVideo merupakan salah satu platform short video yang populer. Tak hanya itu, SnackVideo juga bisa menghasilkan uang dan membuat banyak orang tertarik untuk mencoba mendapatkan reward tersebut. Bagaimana caranya?\n" +
                "\n" +
                "\"Kita punya dua jenis kreator, pertama UGC dan kedua orang-orang yang sudah membuat konten dengan kita. Kita sudah memberikan mereka edukasi, training dan sebagainya. Untuk yang koin, kita mau mengundang semua orang untuk buat konten di SnackVideo. Buat orang yang tinggal di daerah, mereka nggak tahu gimana sih cara membuat konten. Oleh karena itu, kita provide mereka dengan koin. Itu adalah bagian creator center,\" ujar Yugo Prabowo selaku Head of Operation of SnackVideo Indonesia kepada detikINET, Jumat (14/10/2022).\n" +
                "\n" +
                "Bisa dibilang koin adalah cara SnackVideo untuk menarik banyak orang untuk bergabung dengan SnackVideo. Sebab, ada berbagai misi yang dibuat untuk mendapatkan koin bersinggungan dengan membuat konten. Koin ini bisa diuangkan.\n" +
                "\n" +
                "Cara mendapatkan uang di SnackVideo bisa dilakukan dengan menonton video di aplikasi SnackVideo, menyelesaikan misi like video dan follow orang lain, mengajak teman untuk download SnackVideo dan misi lainnya. Satu koin bernilai Rp 0,02 atau Rp 1/50 koin.\n" +
                "\n" +
                "Teng Yee Kiong Country Manager SnackVideo di sela acara press conference SnackVideo Creator's Camp 2022 juga memberikan komentarnya. Menurutnya, meski SnackVideo memberikan reward berupa koin yang bisa diuangkan, sebenarnya misi SnackVideo lebih dari itu.\n" +
                "-ADVERTISEMENT-\n" +
                "\n" +
                "\"Platform kami sebenarnya bukan tentang bagaimana menghasilkan uang, sejujurnya. Menghasilkan uang hanya salah satu cara untuk melanjutkan hidup, sebagaimana yang ada di platform lainnya. Tapi kalau mereka terus membuat konten yang orang suka, mereka menjadi lebih populer, mereka bisa menghasilkan lebih banyak,\" ujarnya.\n" +
                "\n" +
                "\"Kalau punya banyak fans dan lebih populer, income bisa datang dalam bentuk yang berbeda untuk endorsement, sponsorship ataupun iklan,\" sambungnya.\n" +
                "\n" +
                "SnackVideo hingga kini diklaim sudah memiliki lebih dari 10 ribu kreator. Tercatat ada lebih dari 1 juta pengguna yang menggunakan aplikasi SnackVideo setiap harinya. Di dalamnya, SnackVideo memiliki berbagai tipe konten, mulai news, komedi, hingga makanan.";

//        add news4 content attribute
        news4.content = "Jakarta - MotoGP Australia 2022 akan main pada akhir pekan ini. Seri tersebut dinilai seperti babak final karena perolehan poin di Klasemen MotoGP 2022 mepet-mepet!\n" +
                "\n" +
                "Hal itu dijelaskan oleh Keith Huewen eks pebalap Grand Prix dari Inggris. MotoGP Australia 2022 dinilai jadi momentum penting di sisa seri MotoGP 2022.\n" +
                "\n" +
                "\"Saya rasa nanti adalah momen untuk mencari juara dunia. Sebuah memontum di mana satu poin saja akan berarti besar,\" jelasnya dilansir dari Crash.\n" +
                "\n" +
                "Di Klasemen MotoGP 2022 sementara, Fabio Quartararo masih unggul dengan 219 poin. Francesco Bagnaia menempel dengan 217 poin.\n" +
                "\n" +
                "Aleix Espargaro dengan 199 poin juga masih punya peluang. Bahkan peringkat keempat Enea Bastianini (180 poin) dan Jack Miller (179 poin) secara matematis masih punya peluang!\n" +
                "\n" +
                "\"Semua mata akan tertuju di Phillip Island nanti,\" tegas Keith.\n" +
                "\n" +
                "MotoGP 2022 masih sisakan tiga seri. Setelah MotoGP Australia 2022 pada Minggu (16/10) masih tersisa MotoGP Malaysia dan MotoGP Valencia.\n" +
                "\n" +
                "Francesco Bagnaia terus konsisten untuk naik podium di dua seri terakhir. Apes buat Fabio Quartararo, dirinya malah kesulitan.\n" +
                "\n" +
                "Bastianini pun kerap memberi kejutan. Aleix Espargaro memang sempat naik-turun performanya tapi dinilai masih berbahaya. Sedangkan Jack Miller, sedang mendapatkan momentumnya.";

//        add news5 content attribute
        news5.content = "Jakarta - Manchester United dinilai masih tampil buruk. Kemenangan tipis Setan Merah atas Omonia Nicosia menjadi buktinya.\n" +
                "\n" +
                "Saat bertanding di Old Trafford, Jumat (14/10/2022) dini hari WIB, MU menang 1-0 atas wakil Siprus itu dalam lanjutan Liga Europa. Gol dari Scott McTominay menjadi penentu kemenangan The Red Devils.\n" +
                "\n" +
                "Sebanyak 34 sepakan dilepaskan MU ke gawang Omonia dalam catatan Whoscored. Dengan konversi gol cuma dua persen, tim asuhan Erik ten Hag pun mendapatkan rapor merah\n" +
                "\n" +
                "Oleh karena itu, eks pemain Chelsea tak ragu untuk bilang bahwa MU masih bermasalah. Kemenangan MU atas Everton pada akhir pekan lalu juga disinggung.\n" +
                "\n" +
                "\"United mendominasi permainan, tapi mereka bisa kehilangan poin dan kehilangan poin itu bisa menjadi fatal,\" kata Cundy di Talksport.\n" +
                "\n" +
                "\"Mereka masih bisa memuncaki grup, mereka melawat ke markas Real Sociedad dan masih harus bermain di kandang. Tapi, ini grup yang Manchester United seharusnya bisa melaju dan mereka tidak melaju. Masalah di United masih ada di sana.\"\n" +
                "\n" +
                "\"Saya pikir performa melawan Everton di akhir pekan cukup buruk, saya pikir kedua tim rata-rata. Ronaldo mendapatkan peluang dan bisa menyelesaikannya tapi itu bisa selesai imbang,\" kata dia menegaskan.\n" +
                "\n" +
                "MU kini duduk di posisi kedua klasemen Liga Europa Grup E. Mereka mengumpulkan sembilan poin, tertinggal tiga angka dari Real Sociedad di posisi pertama.";

//        add news6 content attribute
        news6.content = "Jakarta - Tim Gabungan Independen Pencari Fakta (TGIPF) Tragedi Kanjuruhan merilis rekomendasi untuk PSSI. Ketua umum dan jajarannya didesak mundur.\n" +
                "\n" +
                "Hal itu tertuang dalam surat rekomendasi TGIPF yang dirilis, Jumat (14/10/2022). Ada 12 rekomendasi, salah satunya ditujukan kepada PSSI, selain di antaranya kepada PT Liga Indonesia Baru (LIB), Panpel, Polri, dan Suporter.\n" +
                "\n" +
                "Dalam poin pertama rekomendasi TGIPF, tim yang dipimpin Menko Polhukam Mahfud MD itu langsung meminta PSSI berbenah. Salah satu hal yang diminta adalah agar ketua umum dan jajarannya, dalam hal ini Komite Eksekutif, mundur dari PSSI\n" +
                "\n" +
                "\"Secara normatif, pemerintah tidak bisa mengintervensi PSSI, namun dalam negara yang memiliki dasar moral dan etik serta budaya adiluhung, sudah sepatutnya Ketua Umum PSSI dan seluruh jajaran Komite Eksekutif mengundurkan diri sebagai bentuk pertanggungjawaban moral atas jatuhnya korban sebanyak 712 orang, di mana saat laporan ini disusun sudah mencapai 132 orang meninggal dunia, 96 orang luka berat, 484 orang luka sedang/ringan yang sebagian bisa saja mengalami dampak jangka panjang,\" tulis Poin 1 rekomendasi TGIPF untuk PSSI\n" +
                "\n" +
                "Lalu poin kedua, TGIPF memerintahkan agar PSSI segera melakukan Kongres Luar Biasa. TGIPF menyebut agar PSSI mendapatkan kepemimpinan dan kepengurusan yang berintegritas.\n" +
                "\n" +
                "\"Untuk menjaga keberlangsungan kepengurusan PSSI dan menyelamatkan persepakbolaan nasional, pemangku kepentingan PSSI diminta untuk melakukan percepatan Kongres atau menggelar Kongres Luar Biasa (KLB) untuk menghasilkan kepemimpinan dan kepengurusan PSSI yang berintegritas, profesional, bertanggungjawab, dan bebas dari konflik kepentingan. Pemerintah tidak akan memberikan izin pertandingan liga sepakbola profesional di bawah PSSI yaitu Liga 1, Liga 2, dan Liga 3, sampai dengan terjadinya perubahan dan kesiapan yang signifikan oleh PSSI dalam mengelola dan menjalankan kompetisi sepakbola di tanah air. Adapun pertandingan sepakbola di luar Liga 1, Liga 2, dan Liga 3 tetap berlangsung dengan memperhatikan ketertiban umum dan berkoordinasi dengan aparat keamanan,\" tulis TGIPF.\n" +
                "\n" +
                "Dalam konferensi pers, Mahfud MD juga meminta PSSI bertanggung jawab secara hukum dan moral. Secara hukum berarti diproses secara hukum, dan moral diharuskan melakukan langkah-langkah yang beradab.\"";

//        add news7 content attribute
        news7.content = "Jakarta - Kementerian Kesehatan RI melaporkan kasus gangguan ginjal akut misterius pada Organisasi Kesehatan Dunia (WHO). Total ada 152 pasien anak dengan gangguan ginjal akut misterius per 14 Oktober 2022 menurut data Ikatan Dokter Anak Indonesia.\n" +
                "\n" +
                "Hingga kini, belum diketahui penyebab gangguan ginjal akut misterius. Namun, beberapa dugaan yang muncul terkait kemungkinan keracunan obat, hingga infeksi MIS-C atau peradangan multisistem pada anak.\n" +
                "\n" +
                "Plt Direktur Pelayanan Kesehatan Primer dr Yanti Herman menyebut pemerintah melakukan komunikasi dengan WHO terkait investigasi yang dilakukan.\n" +
                "\n" +
                "\"Koordinasi dengan WHO untuk melihat bersama-sama kasus acute kidney injury (AKI) di indonesia, kami sedang melaporkan ke WHO terkait dengan hal ini,\" beber dia dalam konferensi pers Jumat (14/10/2022).\n" +
                "\n" +
                "Banyak pasien anak terlanjur dalam kondisi berat saat datang ke fasilitas kesehatan sehingga memerlukan perawatan intensif di ICU. Gejala paling khas yang menyerang anak adalah perburukan yang cepat pada ginjal.\n" +
                "\n" +
                "\"Penurunan cepat dan tiba-tiba pada fungsi filtrasi atau penyaringan ginjal. Biasanya ditandai peningkatan konsentrasi kreatinin serum atau azotemia (peningkatan konsenttasi nitrogen urea darah) dan atau penurunan sampai tidak ada sama sekali urine,\" katanya.\n" +
                "\n" +
                "Karenanya, dr Yanti mengimbau setiap orangtua untuk waspada jika anak kurang dari 18 tahun mengalami gejala demam, diikuti saluran pernapasan akut, gejala infeksi saluran cerna, serta jumlah dan warna urine pekat atau kecokelatan.\n" +
                "\n" +
                "\"Jika memiliki anak di bawah 18 tahun khususnya balita dengan gejala penurunan volume atau frekuensi buang air kecil atau tidak ada buang air kecil dengan atau tanpa demam, segera dibawa ke fasilitas kesehatan terdekat,\" pesannya.";

//        add news8 content attribute
        news8.content = "Jakarta - Viral sejumlah kosmetik ditemukan mengandung bahan berbahaya berdasarkan temuan Badan Pengawas Obat dan Makanan (BPOM RI). Daftar kosmetik berbahaya tersebut tersebar di media sosial, salah satu yang disorot netizen adalah produk Madame Gie.\n" +
                "\n" +
                "Adapun produk Madame Gie yang tercantum dalam daftar kosmetik berbahaya meliputi Madame Gie Sweet Cheek Blushed 03, Madame Gie Nail Shell 14, Madame Gie Nail Sheil 10. Ketiganya disebut positif mengandung K3 hingga K10.\n" +
                "\n" +
                "Daftar kosmetik berbahaya yang viral diunggah di medsos dibenarkan BPOM RI. \"Iya data ini valid sesuai dengan laporan 4 Oktober 2022,\" demikian konfirmasi dalam keterangan tertulis yang diterima detikcom Jumat (14/10/2022).\n" +
                "\n" +
                "Temuan BPOM yang dilaporkan per 4 Oktober silam menyoroti 16 item kosmetik yang mengandung bahan dilarang atau berbahaya. Apa itu pewarna merah K3 dan K10?\n" +
                "\n" +
                "\"Pewarna merah K3 dan Merah K10 merupakan bahan yang berisiko menyebabkan kanker (bersifat karsinogenik),\" terang BPOM.\n" +
                "\n" +
                "\"Total temuan kosmetika ilegal dan atau mengandung bahan dilarang atau berbahaya selama periode Oktober 2021 hingga Agustus 2022 sebanyak lebih dari 1 juta pieces dengan nilai keekonomian sebesar Rp 34,4 miliar,\" kata Deputi BIdang Pengawas Obat Tradisional, Suplemen Kesehatan, dan Kosmetik BPOM RI, Reri Indriani, awal Oktober.";

//        add news9 content attribute
        news9.content = "Jakarta - Apa itu stockholm syndrome? Banyak netizen yang kerap menghubungkan hal tersebut dengan kasus Lesti Kejora yang memaafkan Rizky Billar atas Kekerasan Dalam Rumah Tangga (KDRT). Bahkan laporan KDRT tersebut kini telah dicabut oleh Lesti Kejora dan berujung damai lantaran ingin memperbaiki rumah tangga keduanya.\n" +
                "\n" +
                "\"Memaafkan. Beliau sangat berjanji tidak akan pernah mengulangi lagi,\" ujar Lesti Kejora saat ditemui di Polres Metro Jakarta Selatan, Jumat (14/10/2022), dikutip dari detikHot.\n" +
                "\n" +
                "Apa itu stockholm syndrome?\n" +
                "Perubahan sikap melunak korban terhadap terduga pelaku kejahatan kerap dikaitkan dengan istilah stockholm syndrome. Psikolog klinis Anastasia Sari Dewi menjelaskan stockholm syndrome sebenarnya adalah salah satu bentuk mekanisme pertahanan diri manusia secara psikologi karena lelah.\n" +
                "\n" +
                "\"Daripada melawan terus, marah, takut terus, atau benci terus, akhirnya dia berusaha menerima kondisi dia dengan cara bersimpati terhadap pelaku,\" kata psikolog klinis Anastasia Sari Dewi beberapa waktu lalu.\n" +
                "\n" +
                "Awal Mula Istilah Stockholm Syndrome\n" +
                "Istilah stockholm syndrome sudah dikenal publik sejak tahun 1973. Pada saat itu terjadi perampokan di bank Stockholm, Swedia, dan para karyawan disandera selama enam hari.\n" +
                "\n" +
                "Selama hari-hari penyanderaan tersebut, banyak korban yang merasa simpati kepada pelaku. Setelah mereka dibebaskan, beberapa pegawai bank menolak bersaksi melawan perampok di pengadilan, bahkan mereka mengumpulkan uang untuk membela pelaku.\n" +
                "\n" +
                "Dikutip Healthline, seiring berjalannya waktu, beberapa korban memang mengembangkan perasaan positif terhadap pelaku. Mereka bahkan mungkin mulai merasa seolah-olah mereka memiliki tujuan yang sama.\n" +
                "\n" +
                "Belum banyak ahli yang membahas terkait stockholm syndrome, namun kondisi ini bisa dialami mereka yang menjadi korban kekerasan seperti KDRT, hubungan toksik, sampai pelecehan.\n" +
                "\n" +
                "Gejala Stockholm Syndrome\n" +
                "Dikutip dari Cleveland Clinic, orang-orang dengan stockholm syndrome memiliki gejala, seperti:\n" +
                "\n" +
                "Perasaan positif terhadap para penculik atau pelaku kekerasan.\n" +
                "Simpati untuk keyakinan dan perilaku penculiknya.\n" +
                "Perasaan negatif terhadap polisi atau figur otoritas lainnya.\n" +
                "Pengobatan Stockholm Syndrome\n" +
                "Karena stockholm syndrome tidak diakui sebagai kondisi psikologis, sehingga tidak ada pengobatan standar. Namun seperti pengobatan untuk PTSD (post-traumatic stress disorder), pengobatan stockholm syndrome biasanya melibatkan konseling psikiatris dan psikologis (\"terapi bicara\").";

//        add news to array
        newsList.add(news1);
        newsList.add(news2);
        newsList.add(news3);
        newsList.add(news4);
        newsList.add(news5);
        newsList.add(news6);
        newsList.add(news7);
        newsList.add(news8);
        newsList.add(news9);

//        return array
        return newsList;
    }
}
