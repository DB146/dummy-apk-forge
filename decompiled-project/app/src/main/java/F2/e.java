package F2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f4051a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4052b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4053c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4054d;

    public e(int i7, int i10, long j, long j10) {
        this.f4051a = i7;
        this.f4052b = i10;
        this.f4053c = j;
        this.f4054d = j10;
    }

    public static e a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            e eVar = new e(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return eVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f4051a);
            dataOutputStream.writeInt(this.f4052b);
            dataOutputStream.writeLong(this.f4053c);
            dataOutputStream.writeLong(this.f4054d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f4052b == eVar.f4052b && this.f4053c == eVar.f4053c && this.f4051a == eVar.f4051a && this.f4054d == eVar.f4054d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4052b), Long.valueOf(this.f4053c), Integer.valueOf(this.f4051a), Long.valueOf(this.f4054d));
    }
}
