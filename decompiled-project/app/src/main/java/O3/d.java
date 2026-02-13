package O3;

import A3.l;
import C3.A;
import J3.B;
import N3.g;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: b, reason: collision with root package name */
    public static final d f7467b = new d(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7468a;

    public /* synthetic */ d(int i7) {
        this.f7468a = i7;
    }

    @Override // O3.a
    public final A B(A a9, l lVar) {
        byte[] bArr;
        switch (this.f7468a) {
            case 0:
                return a9;
            default:
                ByteBuffer asReadOnlyBuffer = ((g) ((N3.c) a9.get()).f7173a.f7172b).f7188a.f26189d.asReadOnlyBuffer();
                AtomicReference atomicReference = W3.b.f10596a;
                V8.c cVar = (asReadOnlyBuffer.isReadOnly() || !asReadOnlyBuffer.hasArray()) ? null : new V8.c(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
                if (cVar != null && cVar.f10198a == 0) {
                    if (cVar.f10199b == cVar.f10200c.length) {
                        bArr = asReadOnlyBuffer.array();
                        return new B(bArr);
                    }
                }
                ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
                byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
                asReadOnlyBuffer2.get(bArr2);
                bArr = bArr2;
                return new B(bArr);
        }
    }
}
