package xc;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class a implements Map.Entry, Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f26326d = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f26327e = Pattern.compile("[^-a-zA-Z0-9_:.]+");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f26328f = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]+");

    /* renamed from: a, reason: collision with root package name */
    public final String f26329a;

    /* renamed from: b, reason: collision with root package name */
    public String f26330b;

    /* renamed from: c, reason: collision with root package name */
    public b f26331c;

    public a(String str, String str2, b bVar) {
        vc.i.D(str);
        String trim = str.trim();
        vc.i.A(trim);
        this.f26329a = trim;
        this.f26330b = str2;
        this.f26331c = bVar;
    }

    public static String a(int i7, String str) {
        if (i7 == 2 && !d(str)) {
            String replaceAll = f26327e.matcher(str).replaceAll("_");
            if (d(replaceAll)) {
                return replaceAll;
            }
            return null;
        }
        if (i7 != 1 || c(str)) {
            return str;
        }
        String replaceAll2 = f26328f.matcher(str).replaceAll("_");
        if (c(replaceAll2)) {
            return replaceAll2;
        }
        return null;
    }

    public static void b(String str, String str2, wc.c cVar, f fVar) {
        cVar.b(str);
        if (fVar.f26340f == 1) {
            if (str2 == null) {
                return;
            }
            if ((str2.isEmpty() || str2.equalsIgnoreCase(str)) && Arrays.binarySearch(f26326d, wc.c.c(str)) >= 0) {
                return;
            }
        }
        cVar.b("=\"");
        if (str2 == null) {
            str2 = "";
        }
        n.c(cVar, str2, fVar, 2);
        cVar.a('\"');
    }

    public static boolean c(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = str.charAt(i7);
            if (charAt <= 31 || ((charAt >= 127 && charAt <= 159) || charAt == ' ' || charAt == '\"' || charAt == '\'' || charAt == '/' || charAt == '=')) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        char charAt = str.charAt(0);
        if ((charAt < 'a' || charAt > 'z') && !((charAt >= 'A' && charAt <= 'Z') || charAt == '_' || charAt == ':')) {
            return false;
        }
        for (int i7 = 1; i7 < length; i7++) {
            char charAt2 = str.charAt(i7);
            if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '-' || charAt2 == '_' || charAt2 == ':' || charAt2 == '.'))) {
                return false;
            }
        }
        return true;
    }

    public final Object clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return Objects.equals(this.f26329a, aVar.f26329a) && Objects.equals(this.f26330b, aVar.f26330b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f26329a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        String str = this.f26330b;
        return str == null ? "" : str;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return Objects.hash(this.f26329a, this.f26330b);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        String str;
        int E10;
        String str2 = (String) obj;
        String str3 = this.f26330b;
        b bVar = this.f26331c;
        if (bVar != null && (E10 = bVar.E((str = this.f26329a))) != -1) {
            str3 = this.f26331c.z(str);
            this.f26331c.f26334c[E10] = str2;
        }
        this.f26330b = str2;
        return str3 == null ? "" : str3;
    }

    public final String toString() {
        StringBuilder b2 = wc.l.b();
        wc.c e2 = wc.c.e(b2);
        f fVar = new f();
        String str = this.f26330b;
        String a9 = a(fVar.f26340f, this.f26329a);
        if (a9 != null) {
            b(a9, str, e2, fVar);
        }
        return wc.l.l(b2);
    }
}
