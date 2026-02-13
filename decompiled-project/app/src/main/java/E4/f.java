package E4;

import java.nio.ByteBuffer;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class f extends q4.g {

    /* renamed from: w, reason: collision with root package name */
    public long f3569w;

    /* renamed from: x, reason: collision with root package name */
    public int f3570x;

    /* renamed from: y, reason: collision with root package name */
    public int f3571y;

    @Override // q4.g
    public final void G() {
        super.G();
        this.f3570x = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if ((r0.remaining() + r3.position()) > 3072000) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean K(q4.g gVar) {
        AbstractC1705a.h(!gVar.i(1073741824));
        AbstractC1705a.h(!gVar.i(268435456));
        AbstractC1705a.h(!gVar.i(4));
        int i7 = this.f3570x;
        if (i7 > 0) {
            if (i7 < this.f3571y && gVar.i(Integer.MIN_VALUE) == i(Integer.MIN_VALUE)) {
                ByteBuffer byteBuffer = gVar.f23458d;
                if (byteBuffer != null && (r3 = this.f23458d) != null) {
                }
            }
            return false;
        }
        int i10 = this.f3570x;
        this.f3570x = i10 + 1;
        if (i10 == 0) {
            this.f23460f = gVar.f23460f;
            if (gVar.i(1)) {
                this.f368b = 1;
            }
        }
        if (gVar.i(Integer.MIN_VALUE)) {
            this.f368b = Integer.MIN_VALUE;
        }
        ByteBuffer byteBuffer2 = gVar.f23458d;
        if (byteBuffer2 != null) {
            I(byteBuffer2.remaining());
            this.f23458d.put(byteBuffer2);
        }
        this.f3569w = gVar.f23460f;
        return true;
    }
}
