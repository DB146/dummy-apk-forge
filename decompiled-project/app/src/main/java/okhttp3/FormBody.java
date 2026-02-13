package okhttp3;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l;
import okhttp3.MediaType;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.url._UrlKt;
import rc.C1964h;
import rc.InterfaceC1965i;

/* loaded from: classes2.dex */
public final class FormBody extends RequestBody {

    /* renamed from: c, reason: collision with root package name */
    public static final MediaType f22321c;

    /* renamed from: a, reason: collision with root package name */
    public final List f22322a;

    /* renamed from: b, reason: collision with root package name */
    public final List f22323b;

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f22324a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f22325b;

        public Builder() {
            this(0);
        }

        public Builder(int i7) {
            this.f22324a = new ArrayList();
            this.f22325b = new ArrayList();
        }

        public final void a(String str, String value) {
            l.e(value, "value");
            this.f22324a.add(_UrlKt.b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
            this.f22325b.add(_UrlKt.b(value, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        }

        public final void b(String str, String str2) {
            this.f22324a.add(_UrlKt.b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            this.f22325b.add(_UrlKt.b(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    static {
        new Companion(0);
        MediaType.f22350e.getClass();
        f22321c = MediaType.Companion.a("application/x-www-form-urlencoded");
    }

    public FormBody(ArrayList encodedNames, ArrayList encodedValues) {
        l.e(encodedNames, "encodedNames");
        l.e(encodedValues, "encodedValues");
        this.f22322a = _UtilJvmKt.k(encodedNames);
        this.f22323b = _UtilJvmKt.k(encodedValues);
    }

    @Override // okhttp3.RequestBody
    public final long a() {
        return e(null, true);
    }

    @Override // okhttp3.RequestBody
    public final MediaType b() {
        return f22321c;
    }

    @Override // okhttp3.RequestBody
    public final void d(InterfaceC1965i interfaceC1965i) {
        e(interfaceC1965i, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e(InterfaceC1965i interfaceC1965i, boolean z8) {
        C1964h c1964h;
        if (z8) {
            c1964h = new Object();
        } else {
            l.b(interfaceC1965i);
            c1964h = interfaceC1965i.c();
        }
        List list = this.f22322a;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (i7 > 0) {
                c1964h.l0(38);
            }
            c1964h.r0((String) list.get(i7));
            c1964h.l0(61);
            c1964h.r0((String) this.f22323b.get(i7));
        }
        if (!z8) {
            return 0L;
        }
        long j = c1964h.f23966b;
        c1964h.l();
        return j;
    }
}
