package wc;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final b f25870c = new b(0);

    /* renamed from: d, reason: collision with root package name */
    public static final b f25871d = new b(1);

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f25872e = {"input", "keygen", "object", "select", "textarea"};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25873a;

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f25874b;

    public /* synthetic */ c(int i7, StringBuilder sb2) {
        this.f25873a = i7;
        this.f25874b = sb2;
    }

    public static String c(String str) {
        return str != null ? str.toLowerCase(Locale.ROOT) : "";
    }

    public static String d(String str) {
        return c(str).trim();
    }

    public static c e(StringBuilder sb2) {
        return sb2 != null ? new c(1, sb2) : new c(0, sb2);
    }

    public final c a(char c10) {
        switch (this.f25873a) {
            case 0:
                try {
                    this.f25874b.append(c10);
                    return this;
                } catch (IOException e2) {
                    throw new Db.d(13, e2);
                }
            default:
                this.f25874b.append(c10);
                return this;
        }
    }

    public final c b(String str) {
        switch (this.f25873a) {
            case 0:
                try {
                    this.f25874b.append((CharSequence) str);
                    return this;
                } catch (IOException e2) {
                    throw new Db.d(13, e2);
                }
            default:
                this.f25874b.append((CharSequence) str);
                return this;
        }
    }

    public String toString() {
        switch (this.f25873a) {
            case 1:
                return this.f25874b.toString();
            default:
                return super.toString();
        }
    }
}
