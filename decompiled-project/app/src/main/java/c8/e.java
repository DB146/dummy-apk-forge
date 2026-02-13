package c8;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;
import a8.InterfaceC0789f;
import a8.InterfaceC0790g;
import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements InterfaceC0788e, InterfaceC0790g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14450a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f14451b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f14452c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f14453d;

    /* renamed from: e, reason: collision with root package name */
    public final C0915a f14454e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14455f;

    public e(Writer writer, HashMap hashMap, HashMap hashMap2, C0915a c0915a, boolean z8) {
        this.f14451b = new JsonWriter(writer);
        this.f14452c = hashMap;
        this.f14453d = hashMap2;
        this.f14454e = c0915a;
        this.f14455f = z8;
    }

    @Override // a8.InterfaceC0788e
    public final InterfaceC0788e a(C0786c c0786c, long j) {
        String str = c0786c.f12798a;
        j();
        JsonWriter jsonWriter = this.f14451b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j);
        return this;
    }

    @Override // a8.InterfaceC0788e
    public final InterfaceC0788e b(C0786c c0786c, int i7) {
        String str = c0786c.f12798a;
        j();
        JsonWriter jsonWriter = this.f14451b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(i7);
        return this;
    }

    @Override // a8.InterfaceC0788e
    public final InterfaceC0788e c(C0786c c0786c, double d10) {
        String str = c0786c.f12798a;
        j();
        JsonWriter jsonWriter = this.f14451b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d10);
        return this;
    }

    @Override // a8.InterfaceC0790g
    public final InterfaceC0790g d(String str) {
        j();
        this.f14451b.value(str);
        return this;
    }

    @Override // a8.InterfaceC0790g
    public final InterfaceC0790g e(boolean z8) {
        j();
        this.f14451b.value(z8);
        return this;
    }

    @Override // a8.InterfaceC0788e
    public final InterfaceC0788e f(C0786c c0786c, Object obj) {
        i(obj, c0786c.f12798a);
        return this;
    }

    @Override // a8.InterfaceC0788e
    public final InterfaceC0788e g(C0786c c0786c, boolean z8) {
        String str = c0786c.f12798a;
        j();
        JsonWriter jsonWriter = this.f14451b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z8);
        return this;
    }

    public final e h(Object obj) {
        JsonWriter jsonWriter = this.f14451b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    h(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        i(entry.getValue(), (String) key);
                    } catch (ClassCastException e2) {
                        throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e2);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            InterfaceC0787d interfaceC0787d = (InterfaceC0787d) this.f14452c.get(obj.getClass());
            if (interfaceC0787d != null) {
                jsonWriter.beginObject();
                interfaceC0787d.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            InterfaceC0789f interfaceC0789f = (InterfaceC0789f) this.f14453d.get(obj.getClass());
            if (interfaceC0789f != null) {
                interfaceC0789f.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f14454e.a(obj, this);
                throw null;
            }
            if (obj instanceof f) {
                int a9 = ((f) obj).a();
                j();
                jsonWriter.value(a9);
            } else {
                String name = ((Enum) obj).name();
                j();
                jsonWriter.value(name);
            }
            return this;
        }
        if (obj instanceof byte[]) {
            j();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i7 = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i7 < length) {
                jsonWriter.value(r6[i7]);
                i7++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i7 < length2) {
                long j = jArr[i7];
                j();
                jsonWriter.value(j);
                i7++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i7 < length3) {
                jsonWriter.value(dArr[i7]);
                i7++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i7 < length4) {
                jsonWriter.value(zArr[i7]);
                i7++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i7 < length5) {
                h(numberArr[i7]);
                i7++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i7 < length6) {
                h(objArr[i7]);
                i7++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final e i(Object obj, String str) {
        boolean z8 = this.f14455f;
        JsonWriter jsonWriter = this.f14451b;
        if (z8) {
            if (obj != null) {
                j();
                jsonWriter.name(str);
                h(obj);
            }
            return this;
        }
        j();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            h(obj);
        }
        return this;
    }

    public final void j() {
        if (!this.f14450a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
