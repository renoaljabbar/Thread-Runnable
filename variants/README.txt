Folder ini berisi variasi kode MainActivity sesuai urutan langkah pada modul 3.
Project utama (app/src/main) memakai versi runOnUiThread (langkah 7).

Cara mengganti variasi:
1. Buka salah satu berkas .kt.txt di folder ini, salin seluruh isinya.
2. Tempel (ganti seluruh isi) ke app/src/main/java/com/example/threadrunnable/MainActivity.kt.

Variasi:
- MainActivity_1_SimpleThread.kt.txt : Thread + Runnable sederhana (langkah 5)
- (aktif) runOnUiThread              : langkah 7
- MainActivity_3_Handler.kt.txt      : Handler dan Message (langkah 9)
- MainActivity_4_AsyncTask.kt.txt    : AsyncTask (langkah 11)
- MainActivity_5_WorkManager.kt.txt  : WorkManager (langkah 14-15)
    -> juga buat kelas MyWorker.kt di package yang sama dari MyWorker.kt.txt
       (dependency WorkManager sudah ada di app/build.gradle.kts)
