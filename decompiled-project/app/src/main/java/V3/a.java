package V3;

import A3.h;
import W3.o;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: b, reason: collision with root package name */
    public final int f10027b;

    /* renamed from: c, reason: collision with root package name */
    public final h f10028c;

    public a(int i7, h hVar) {
        this.f10027b = i7;
        this.f10028c = hVar;
    }

    @Override // A3.h
    public final void b(MessageDigest messageDigest) {
        this.f10028c.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f10027b).array());
    }

    @Override // A3.h
    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f10027b == aVar.f10027b && this.f10028c.equals(aVar.f10028c);
    }

    @Override // A3.h
    public final int hashCode() {
        return o.h(this.f10027b, this.f10028c);
    }
}
