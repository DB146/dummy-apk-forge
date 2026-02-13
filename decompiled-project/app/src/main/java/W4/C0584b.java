package W4;

import java.util.regex.Pattern;
import m4.C1586o0;
import n5.AbstractC1705a;

/* renamed from: W4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0584b {

    /* renamed from: a, reason: collision with root package name */
    public final int f10668a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10669b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10670c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10671d;

    public C0584b(int i7, int i10, int i11, String str) {
        this.f10668a = i7;
        this.f10669b = str;
        this.f10670c = i10;
        this.f10671d = i11;
    }

    public static C0584b a(String str) {
        int i7 = n5.D.f21141a;
        String[] split = str.split(" ", 2);
        AbstractC1705a.h(split.length == 2);
        String str2 = split[0];
        Pattern pattern = z.f10807a;
        try {
            int parseInt = Integer.parseInt(str2);
            int i10 = -1;
            String[] split2 = split[1].trim().split("/", -1);
            AbstractC1705a.h(split2.length >= 2);
            String str3 = split2[1];
            try {
                int parseInt2 = Integer.parseInt(str3);
                if (split2.length == 3) {
                    String str4 = split2[2];
                    try {
                        i10 = Integer.parseInt(str4);
                    } catch (NumberFormatException e2) {
                        throw C1586o0.b(str4, e2);
                    }
                }
                return new C0584b(parseInt, parseInt2, i10, split2[0]);
            } catch (NumberFormatException e10) {
                throw C1586o0.b(str3, e10);
            }
        } catch (NumberFormatException e11) {
            throw C1586o0.b(str2, e11);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0584b.class != obj.getClass()) {
            return false;
        }
        C0584b c0584b = (C0584b) obj;
        return this.f10668a == c0584b.f10668a && this.f10669b.equals(c0584b.f10669b) && this.f10670c == c0584b.f10670c && this.f10671d == c0584b.f10671d;
    }

    public final int hashCode() {
        return ((A3.c.d((217 + this.f10668a) * 31, 31, this.f10669b) + this.f10670c) * 31) + this.f10671d;
    }
}
