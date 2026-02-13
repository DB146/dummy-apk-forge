package W4;

import P4.Z;
import android.os.Handler;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import m5.InterfaceC1603G;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class w implements InterfaceC1603G {

    /* renamed from: a, reason: collision with root package name */
    public final DataInputStream f10792a;

    /* renamed from: b, reason: collision with root package name */
    public final Z f10793b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f10794c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f10795d;

    /* JADX WARN: Type inference failed for: r1v2, types: [P4.Z, java.lang.Object] */
    public w(y yVar, InputStream inputStream) {
        this.f10795d = yVar;
        this.f10792a = new DataInputStream(inputStream);
        ?? obj = new Object();
        obj.f7977c = new ArrayList();
        obj.f7975a = 1;
        this.f10793b = obj;
    }

    @Override // m5.InterfaceC1603G
    public final void b() {
        String str;
        while (!this.f10794c) {
            byte readByte = this.f10792a.readByte();
            if (readByte == 36) {
                int readUnsignedByte = this.f10792a.readUnsignedByte();
                int readUnsignedShort = this.f10792a.readUnsignedShort();
                byte[] bArr = new byte[readUnsignedShort];
                this.f10792a.readFully(bArr, 0, readUnsignedShort);
                G g = (G) this.f10795d.f10803c.get(Integer.valueOf(readUnsignedByte));
                if (g != null && !this.f10795d.f10806f) {
                    g.f10654e.add(bArr);
                }
            } else if (this.f10795d.f10806f) {
                continue;
            } else {
                q3.s sVar = this.f10795d.f10801a;
                Z z8 = this.f10793b;
                DataInputStream dataInputStream = this.f10792a;
                z8.getClass();
                N6.H a9 = z8.a(Z.b(readByte, dataInputStream));
                while (a9 == null) {
                    if (z8.f7975a == 3) {
                        long j = z8.f7976b;
                        if (j <= 0) {
                            throw new IllegalStateException("Expects a greater than zero Content-Length.");
                        }
                        int f4 = h3.H.f(j);
                        AbstractC1705a.m(f4 != -1);
                        byte[] bArr2 = new byte[f4];
                        dataInputStream.readFully(bArr2, 0, f4);
                        AbstractC1705a.m(z8.f7975a == 3);
                        if (f4 > 0) {
                            int i7 = f4 - 1;
                            if (bArr2[i7] == 10) {
                                if (f4 > 1) {
                                    int i10 = f4 - 2;
                                    if (bArr2[i10] == 13) {
                                        str = new String(bArr2, 0, i10, y.f10800u);
                                        ArrayList arrayList = (ArrayList) z8.f7977c;
                                        arrayList.add(str);
                                        a9 = N6.H.F(arrayList);
                                        ((ArrayList) z8.f7977c).clear();
                                        z8.f7975a = 1;
                                        z8.f7976b = 0L;
                                    }
                                }
                                str = new String(bArr2, 0, i7, y.f10800u);
                                ArrayList arrayList2 = (ArrayList) z8.f7977c;
                                arrayList2.add(str);
                                a9 = N6.H.F(arrayList2);
                                ((ArrayList) z8.f7977c).clear();
                                z8.f7975a = 1;
                                z8.f7976b = 0L;
                            }
                        }
                        throw new IllegalArgumentException("Message body is empty or does not end with a LF.");
                    }
                    a9 = z8.a(Z.b(dataInputStream.readByte(), dataInputStream));
                }
                ((Handler) sVar.f23438b).post(new Aa.j(10, sVar, a9));
            }
        }
    }

    @Override // m5.InterfaceC1603G
    public final void d() {
        this.f10794c = true;
    }
}
