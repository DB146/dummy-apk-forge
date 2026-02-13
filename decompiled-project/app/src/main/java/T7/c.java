package T7;

/* loaded from: classes.dex */
public class c implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final c f9328b = new c("[MIN_NAME]");

    /* renamed from: c, reason: collision with root package name */
    public static final c f9329c = new c("[MAX_KEY]");

    /* renamed from: d, reason: collision with root package name */
    public static final c f9330d = new c(".priority");

    /* renamed from: a, reason: collision with root package name */
    public final String f9331a;

    public c(String str) {
        this.f9331a = str;
    }

    public static c b(String str) {
        Integer g = O7.k.g(str);
        if (g != null) {
            return new b(str, g.intValue());
        }
        if (str.equals(".priority")) {
            return f9330d;
        }
        O7.k.c(!str.contains("/"));
        return new c(str);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(c cVar) {
        int i7 = 0;
        if (this == cVar) {
            return 0;
        }
        String str = this.f9331a;
        if (str.equals("[MIN_NAME]") || cVar.f9331a.equals("[MAX_KEY]")) {
            return -1;
        }
        String str2 = cVar.f9331a;
        if (str2.equals("[MIN_NAME]") || str.equals("[MAX_KEY]")) {
            return 1;
        }
        if (!(this instanceof b)) {
            if (cVar instanceof b) {
                return 1;
            }
            return str.compareTo(str2);
        }
        if (!(cVar instanceof b)) {
            return -1;
        }
        int d10 = cVar.d();
        char[] cArr = O7.k.f7501a;
        int i10 = ((b) this).f9327e;
        int i11 = i10 < d10 ? -1 : i10 == d10 ? 0 : 1;
        if (i11 != 0) {
            return i11;
        }
        int length = str.length();
        int length2 = str2.length();
        if (length < length2) {
            i7 = -1;
        } else if (length != length2) {
            i7 = 1;
        }
        return i7;
    }

    public int d() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return this.f9331a.equals(((c) obj).f9331a);
    }

    public final int hashCode() {
        return this.f9331a.hashCode();
    }

    public String toString() {
        return h3.o.p(new StringBuilder("ChildKey(\""), this.f9331a, "\")");
    }
}
