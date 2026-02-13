package m5;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import y7.u0;

/* renamed from: m5.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1597A extends C1617n {

    /* renamed from: c, reason: collision with root package name */
    public final int f20534c;

    public C1597A() {
        super(2008);
        this.f20534c = 1;
    }

    public C1597A(int i7, IOException iOException, String str) {
        super(str, iOException, a(i7, 1));
        this.f20534c = 1;
    }

    public C1597A(IOException iOException, int i7, int i10) {
        super(a(i7, i10), iOException);
        this.f20534c = i10;
    }

    public C1597A(String str, int i7) {
        super(str, a(i7, 1));
        this.f20534c = 1;
    }

    public static int a(int i7, int i10) {
        if (i7 == 2000 && i10 == 1) {
            return 2001;
        }
        return i7;
    }

    public static C1597A b(IOException iOException, int i7) {
        String message = iOException.getMessage();
        int i10 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !u0.N(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i10 == 2007 ? new C1597A(2007, iOException, "Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted") : new C1597A(iOException, i10, i7);
    }
}
