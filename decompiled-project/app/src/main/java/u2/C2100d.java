package u2;

import android.content.SharedPreferences;
import android.util.Log;
import c2.q;
import com.kt.apps.media.xemtv.App;
import h3.o;
import h7.g;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* renamed from: u2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2100d implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final File f24831a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24832b;

    /* renamed from: c, reason: collision with root package name */
    public final File f24833c;

    /* renamed from: d, reason: collision with root package name */
    public final RandomAccessFile f24834d;

    /* renamed from: e, reason: collision with root package name */
    public final FileChannel f24835e;

    /* renamed from: f, reason: collision with root package name */
    public final FileLock f24836f;

    public C2100d(File file, File file2) {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f24831a = file;
        this.f24833c = file2;
        this.f24832b = F(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f24834d = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f24835e = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f24836f = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e2) {
                e = e2;
                l(this.f24835e);
                throw e;
            } catch (Error e10) {
                e = e10;
                l(this.f24835e);
                throw e;
            } catch (RuntimeException e11) {
                e = e11;
                l(this.f24835e);
                throw e;
            }
        } catch (IOException e12) {
            e = e12;
            l(this.f24834d);
            throw e;
        } catch (Error e13) {
            e = e13;
            l(this.f24834d);
            throw e;
        } catch (RuntimeException e14) {
            e = e14;
            l(this.f24834d);
            throw e;
        }
    }

    public static long F(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            g k = q.k(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j = k.f17853b;
            randomAccessFile.seek(k.f17852a);
            byte[] bArr = new byte[16384];
            int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
            while (read != -1) {
                crc32.update(bArr, 0, read);
                j -= read;
                if (j == 0) {
                    break;
                }
                read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            return value == -1 ? value - 1 : value;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    public static void U(App app, long j, long j10, ArrayList arrayList) {
        SharedPreferences.Editor edit = app.getSharedPreferences("multidex.version", 4).edit();
        edit.putLong("timestamp", j);
        edit.putLong("crc", j10);
        edit.putInt("dex.number", arrayList.size() + 1);
        Iterator it = arrayList.iterator();
        int i7 = 2;
        while (it.hasNext()) {
            C2099c c2099c = (C2099c) it.next();
            edit.putLong(o.l(i7, "dex.crc."), c2099c.f24830a);
            edit.putLong("dex.time." + i7, c2099c.lastModified());
            i7++;
        }
        edit.commit();
    }

    public static void l(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
            Log.w("MultiDex", "Failed to close resource", e2);
        }
    }

    public static void n(ZipFile zipFile, ZipEntry zipEntry, C2099c c2099c, String str) {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile(X.c.t("tmp-", str), ".zip", c2099c.getParentFile());
        Log.i("MultiDex", "Extracting " + createTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, read);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!createTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + c2099c.getAbsolutePath() + "\")");
                }
                Log.i("MultiDex", "Renaming to " + c2099c.getPath());
                if (createTempFile.renameTo(c2099c)) {
                    l(inputStream);
                    createTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + c2099c.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            l(inputStream);
            createTempFile.delete();
            throw th2;
        }
    }

    public final ArrayList K(App app, boolean z8) {
        ArrayList T10;
        ArrayList arrayList;
        StringBuilder sb2 = new StringBuilder("MultiDexExtractor.load(");
        File file = this.f24831a;
        sb2.append(file.getPath());
        sb2.append(", ");
        sb2.append(z8);
        sb2.append(", )");
        Log.i("MultiDex", sb2.toString());
        if (!this.f24836f.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z8) {
            SharedPreferences sharedPreferences = app.getSharedPreferences("multidex.version", 4);
            long j = sharedPreferences.getLong("timestamp", -1L);
            long lastModified = file.lastModified();
            if (lastModified == -1) {
                lastModified--;
            }
            if (j == lastModified && sharedPreferences.getLong("crc", -1L) == this.f24832b) {
                try {
                    arrayList = P(app);
                } catch (IOException e2) {
                    Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e2);
                    T10 = T();
                    long lastModified2 = file.lastModified();
                    if (lastModified2 == -1) {
                        lastModified2--;
                    }
                    U(app, lastModified2, this.f24832b, T10);
                }
                Log.i("MultiDex", "load found " + arrayList.size() + " secondary dex files");
                return arrayList;
            }
        }
        if (z8) {
            Log.i("MultiDex", "Forced extraction must be performed.");
        } else {
            Log.i("MultiDex", "Detected that extraction must be performed.");
        }
        T10 = T();
        long lastModified3 = file.lastModified();
        if (lastModified3 == -1) {
            lastModified3--;
        }
        U(app, lastModified3, this.f24832b, T10);
        arrayList = T10;
        Log.i("MultiDex", "load found " + arrayList.size() + " secondary dex files");
        return arrayList;
    }

    public final ArrayList P(App app) {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str = this.f24831a.getName() + ".classes";
        SharedPreferences sharedPreferences = app.getSharedPreferences("multidex.version", 4);
        int i7 = sharedPreferences.getInt("dex.number", 1);
        ArrayList arrayList = new ArrayList(i7 - 1);
        for (int i10 = 2; i10 <= i7; i10++) {
            C2099c c2099c = new C2099c(this.f24833c, str + i10 + ".zip");
            if (!c2099c.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + c2099c.getPath() + "'");
            }
            c2099c.f24830a = F(c2099c);
            long j = sharedPreferences.getLong("dex.crc." + i10, -1L);
            long j10 = sharedPreferences.getLong("dex.time." + i10, -1L);
            long lastModified = c2099c.lastModified();
            if (j10 != lastModified || j != c2099c.f24830a) {
                throw new IOException("Invalid extracted dex: " + c2099c + " (key \"\"), expected modification time: " + j10 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + c2099c.f24830a);
            }
            arrayList.add(c2099c);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.FileFilter, java.lang.Object] */
    public final ArrayList T() {
        Throwable th;
        boolean z8;
        StringBuilder sb2 = new StringBuilder();
        File file = this.f24831a;
        sb2.append(file.getName());
        sb2.append(".classes");
        String sb3 = sb2.toString();
        ?? obj = new Object();
        File file2 = this.f24833c;
        File[] listFiles = file2.listFiles((FileFilter) obj);
        String str = "MultiDex";
        if (listFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + file2.getPath() + ").");
        } else {
            for (File file3 : listFiles) {
                Log.i("MultiDex", "Trying to delete old file " + file3.getPath() + " of size " + file3.length());
                if (file3.delete()) {
                    Log.i("MultiDex", "Deleted old file " + file3.getPath());
                } else {
                    Log.w("MultiDex", "Failed to delete old file " + file3.getPath());
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        try {
            int i7 = 2;
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            while (entry != null) {
                C2099c c2099c = new C2099c(file2, sb3 + i7 + ".zip");
                arrayList.add(c2099c);
                Log.i(str, "Extraction is needed for file " + c2099c);
                int i10 = 0;
                boolean z10 = false;
                while (i10 < 3 && !z10) {
                    int i11 = i10 + 1;
                    n(zipFile, entry, c2099c, sb3);
                    String str2 = str;
                    try {
                        c2099c.f24830a = F(c2099c);
                        z8 = true;
                        str = str2;
                    } catch (IOException e2) {
                        try {
                            str = str2;
                            Log.w(str, "Failed to read crc from " + c2099c.getAbsolutePath(), e2);
                            z8 = false;
                        } catch (Throwable th2) {
                            th = th2;
                            str = str2;
                            th = th;
                            try {
                                zipFile.close();
                                throw th;
                            } catch (IOException e10) {
                                Log.w(str, "Failed to close resource", e10);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        str = str2;
                        zipFile.close();
                        throw th;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Extraction ");
                    sb4.append(z8 ? "succeeded" : "failed");
                    sb4.append(" '");
                    sb4.append(c2099c.getAbsolutePath());
                    sb4.append("': length ");
                    ZipEntry zipEntry = entry;
                    String str3 = sb3;
                    sb4.append(c2099c.length());
                    sb4.append(" - crc: ");
                    sb4.append(c2099c.f24830a);
                    Log.i(str, sb4.toString());
                    if (!z8) {
                        c2099c.delete();
                        if (c2099c.exists()) {
                            Log.w(str, "Failed to delete corrupted secondary dex '" + c2099c.getPath() + "'");
                        }
                    }
                    sb3 = str3;
                    entry = zipEntry;
                    z10 = z8;
                    i10 = i11;
                }
                String str4 = sb3;
                if (!z10) {
                    throw new IOException("Could not create zip file " + c2099c.getAbsolutePath() + " for secondary dex (" + i7 + ")");
                }
                i7++;
                entry = zipFile.getEntry("classes" + i7 + ".dex");
                sb3 = str4;
            }
            try {
                zipFile.close();
            } catch (IOException e11) {
                Log.w(str, "Failed to close resource", e11);
            }
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f24836f.release();
        this.f24835e.close();
        this.f24834d.close();
    }
}
