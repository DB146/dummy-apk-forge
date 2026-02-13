package V2;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public class i implements U2.e {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f10025a;

    public i(SQLiteProgram delegate) {
        l.e(delegate, "delegate");
        this.f10025a = delegate;
    }

    @Override // U2.e
    public final void a(int i7) {
        this.f10025a.bindNull(i7);
    }

    @Override // U2.e
    public final void b(int i7, double d10) {
        this.f10025a.bindDouble(i7, d10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10025a.close();
    }

    @Override // U2.e
    public final void f(int i7, long j) {
        this.f10025a.bindLong(i7, j);
    }

    @Override // U2.e
    public final void g(int i7, byte[] bArr) {
        this.f10025a.bindBlob(i7, bArr);
    }

    @Override // U2.e
    public final void p(int i7, String value) {
        l.e(value, "value");
        this.f10025a.bindString(i7, value);
    }
}
