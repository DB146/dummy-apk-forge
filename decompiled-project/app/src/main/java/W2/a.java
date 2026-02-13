package W2;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f10589e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10590a;

    /* renamed from: b, reason: collision with root package name */
    public final File f10591b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f10592c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f10593d;

    public a(String str, File file, boolean z8) {
        Lock lock;
        this.f10590a = z8;
        this.f10591b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap hashMap = f10589e;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    hashMap.put(str, obj);
                }
                lock = (Lock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f10592c = lock;
    }

    public final void a(boolean z8) {
        this.f10592c.lock();
        if (z8) {
            File file = this.f10591b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f10593d = channel;
            } catch (IOException e2) {
                this.f10593d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e2);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f10593d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f10592c.unlock();
    }
}
