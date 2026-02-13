package w3;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: w3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2211d extends ByteArrayOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2212e f25773a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2211d(C2212e c2212e, int i7) {
        super(i7);
        this.f25773a = c2212e;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i7 = ((ByteArrayOutputStream) this).count;
        if (i7 > 0 && ((ByteArrayOutputStream) this).buf[i7 - 1] == 13) {
            i7--;
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i7, this.f25773a.f25775b.name());
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }
}
