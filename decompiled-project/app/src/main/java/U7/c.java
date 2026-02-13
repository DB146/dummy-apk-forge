package U7;

import B0.C0178g0;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: b, reason: collision with root package name */
    public static final C0178g0 f9821b = new C0178g0(2);

    /* renamed from: a, reason: collision with root package name */
    public StringBuilder f9822a;

    static {
        new C0178g0(3);
    }

    @Override // U7.b
    public final boolean a(byte[] bArr) {
        String str;
        try {
            str = ((CharsetDecoder) f9821b.get()).decode(ByteBuffer.wrap(bArr)).toString();
        } catch (CharacterCodingException unused) {
            str = null;
        }
        if (str == null) {
            return false;
        }
        this.f9822a.append(str);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [D9.a, java.lang.Object] */
    @Override // U7.b
    public final D9.a b() {
        String sb2 = this.f9822a.toString();
        ?? obj = new Object();
        obj.f3289a = sb2;
        return obj;
    }
}
