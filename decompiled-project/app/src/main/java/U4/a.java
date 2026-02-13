package U4;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import m5.C1618o;
import m5.C1619p;
import m5.InterfaceC1616m;
import m5.T;

/* loaded from: classes.dex */
public final class a implements InterfaceC1616m {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1616m f9512a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f9513b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f9514c;

    /* renamed from: d, reason: collision with root package name */
    public CipherInputStream f9515d;

    public a(InterfaceC1616m interfaceC1616m, byte[] bArr, byte[] bArr2) {
        this.f9512a = interfaceC1616m;
        this.f9513b = bArr;
        this.f9514c = bArr2;
    }

    @Override // m5.InterfaceC1613j
    public final int D(byte[] bArr, int i7, int i10) {
        this.f9515d.getClass();
        int read = this.f9515d.read(bArr, i7, i10);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    @Override // m5.InterfaceC1616m
    public final void a(T t5) {
        t5.getClass();
        this.f9512a.a(t5);
    }

    @Override // m5.InterfaceC1616m
    public final void close() {
        if (this.f9515d != null) {
            this.f9515d = null;
            this.f9512a.close();
        }
    }

    @Override // m5.InterfaceC1616m
    public final long d(C1619p c1619p) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f9513b, "AES"), new IvParameterSpec(this.f9514c));
                C1618o c1618o = new C1618o(this.f9512a, c1619p);
                this.f9515d = new CipherInputStream(c1618o, cipher);
                c1618o.l();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e2) {
                throw new RuntimeException(e2);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // m5.InterfaceC1616m
    public final Map n() {
        return this.f9512a.n();
    }

    @Override // m5.InterfaceC1616m
    public final Uri w() {
        return this.f9512a.w();
    }
}
