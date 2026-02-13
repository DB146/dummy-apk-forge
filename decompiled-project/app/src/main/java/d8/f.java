package d8;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;
import a8.InterfaceC0789f;
import c8.C0915a;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class f implements InterfaceC0788e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f16554f = Charset.forName("UTF-8");
    public static final C0786c g = new C0786c("key", X.c.p(X.c.o(e.class, new C1056a(1))));

    /* renamed from: h, reason: collision with root package name */
    public static final C0786c f16555h = new C0786c("value", X.c.p(X.c.o(e.class, new C1056a(2))));

    /* renamed from: i, reason: collision with root package name */
    public static final C0915a f16556i = new C0915a(1);

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f16557a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f16558b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f16559c;

    /* renamed from: d, reason: collision with root package name */
    public final C0915a f16560d;

    /* renamed from: e, reason: collision with root package name */
    public final h f16561e = new h(this);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, C0915a c0915a) {
        this.f16557a = byteArrayOutputStream;
        this.f16558b = hashMap;
        this.f16559c = hashMap2;
        this.f16560d = c0915a;
    }

    public static int j(C0786c c0786c) {
        e eVar = (e) ((Annotation) c0786c.f12799b.get(e.class));
        if (eVar != null) {
            return ((C1056a) eVar).f16550a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override // a8.InterfaceC0788e
    public final InterfaceC0788e a(C0786c c0786c, long j) {
        if (j != 0) {
            e eVar = (e) ((Annotation) c0786c.f12799b.get(e.class));
            if (eVar == null) {
                throw new RuntimeException("Field has no @Protobuf config");
            }
            k(((C1056a) eVar).f16550a << 3);
            l(j);
        }
        return this;
    }

    @Override // a8.InterfaceC0788e
    public final InterfaceC0788e b(C0786c c0786c, int i7) {
        e(c0786c, i7, true);
        return this;
    }

    @Override // a8.InterfaceC0788e
    public final InterfaceC0788e c(C0786c c0786c, double d10) {
        d(c0786c, d10, true);
        return this;
    }

    public final void d(C0786c c0786c, double d10, boolean z8) {
        if (z8 && d10 == 0.0d) {
            return;
        }
        k((j(c0786c) << 3) | 1);
        this.f16557a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d10).array());
    }

    public final void e(C0786c c0786c, int i7, boolean z8) {
        if (z8 && i7 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) c0786c.f12799b.get(e.class));
        if (eVar == null) {
            throw new RuntimeException("Field has no @Protobuf config");
        }
        k(((C1056a) eVar).f16550a << 3);
        k(i7);
    }

    @Override // a8.InterfaceC0788e
    public final InterfaceC0788e f(C0786c c0786c, Object obj) {
        h(c0786c, obj, true);
        return this;
    }

    @Override // a8.InterfaceC0788e
    public final InterfaceC0788e g(C0786c c0786c, boolean z8) {
        e(c0786c, z8 ? 1 : 0, true);
        return this;
    }

    public final void h(C0786c c0786c, Object obj, boolean z8) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z8 && charSequence.length() == 0) {
                return;
            }
            k((j(c0786c) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f16554f);
            k(bytes.length);
            this.f16557a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                h(c0786c, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                i(f16556i, c0786c, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            d(c0786c, ((Double) obj).doubleValue(), z8);
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z8 && floatValue == 0.0f) {
                return;
            }
            k((j(c0786c) << 3) | 5);
            this.f16557a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (z8 && longValue == 0) {
                return;
            }
            e eVar = (e) ((Annotation) c0786c.f12799b.get(e.class));
            if (eVar == null) {
                throw new RuntimeException("Field has no @Protobuf config");
            }
            k(((C1056a) eVar).f16550a << 3);
            l(longValue);
            return;
        }
        if (obj instanceof Boolean) {
            e(c0786c, ((Boolean) obj).booleanValue() ? 1 : 0, z8);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z8 && bArr.length == 0) {
                return;
            }
            k((j(c0786c) << 3) | 2);
            k(bArr.length);
            this.f16557a.write(bArr);
            return;
        }
        InterfaceC0787d interfaceC0787d = (InterfaceC0787d) this.f16558b.get(obj.getClass());
        if (interfaceC0787d != null) {
            i(interfaceC0787d, c0786c, obj, z8);
            return;
        }
        InterfaceC0789f interfaceC0789f = (InterfaceC0789f) this.f16559c.get(obj.getClass());
        if (interfaceC0789f != null) {
            h hVar = this.f16561e;
            hVar.f16563a = false;
            hVar.f16565c = c0786c;
            hVar.f16564b = z8;
            interfaceC0789f.a(obj, hVar);
            return;
        }
        if (obj instanceof InterfaceC1058c) {
            e(c0786c, ((InterfaceC1058c) obj).a(), true);
        } else if (obj instanceof Enum) {
            e(c0786c, ((Enum) obj).ordinal(), true);
        } else {
            i(this.f16560d, c0786c, obj, z8);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, d8.b] */
    public final void i(InterfaceC0787d interfaceC0787d, C0786c c0786c, Object obj, boolean z8) {
        ?? outputStream = new OutputStream();
        outputStream.f16551a = 0L;
        try {
            OutputStream outputStream2 = this.f16557a;
            this.f16557a = outputStream;
            try {
                interfaceC0787d.a(obj, this);
                this.f16557a = outputStream2;
                long j = outputStream.f16551a;
                outputStream.close();
                if (z8 && j == 0) {
                    return;
                }
                k((j(c0786c) << 3) | 2);
                l(j);
                interfaceC0787d.a(obj, this);
            } catch (Throwable th) {
                this.f16557a = outputStream2;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                outputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void k(int i7) {
        while ((i7 & (-128)) != 0) {
            this.f16557a.write((i7 & 127) | 128);
            i7 >>>= 7;
        }
        this.f16557a.write(i7 & 127);
    }

    public final void l(long j) {
        while (((-128) & j) != 0) {
            this.f16557a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f16557a.write(((int) j) & 127);
    }
}
