package x7;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes.dex */
public final class m implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f26270c = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final File f26271a;

    /* renamed from: b, reason: collision with root package name */
    public l f26272b;

    public m(File file) {
        this.f26271a = file;
    }

    @Override // x7.d
    public final void a() {
        v7.g.b(this.f26272b, "There was a problem closing the Crashlytics log file.");
        this.f26272b = null;
    }

    public final void b() {
        File file = this.f26271a;
        if (this.f26272b == null) {
            try {
                this.f26272b = new l(file);
            } catch (IOException e2) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0047  */
    @Override // x7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String c() {
        Z8.a aVar;
        byte[] bArr;
        if (this.f26271a.exists()) {
            b();
            l lVar = this.f26272b;
            if (lVar != null) {
                int[] iArr = {0};
                byte[] bArr2 = new byte[lVar.X()];
                try {
                    this.f26272b.F(new f(bArr2, iArr));
                } catch (IOException e2) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e2);
                }
                aVar = new Z8.a(bArr2, iArr[0]);
                if (aVar != null) {
                    bArr = null;
                } else {
                    int i7 = aVar.f12207a;
                    bArr = new byte[i7];
                    System.arraycopy(aVar.f12208b, 0, bArr, 0, i7);
                }
                if (bArr == null) {
                    return new String(bArr, f26270c);
                }
                return null;
            }
        }
        aVar = null;
        if (aVar != null) {
        }
        if (bArr == null) {
        }
    }

    @Override // x7.d
    public final void f(String str, long j) {
        b();
        if (this.f26272b == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "..." + str.substring(str.length() - 16384);
            }
            this.f26272b.l(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f26270c));
            while (!this.f26272b.K() && this.f26272b.X() > 65536) {
                this.f26272b.U();
            }
        } catch (IOException e2) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e2);
        }
    }
}
