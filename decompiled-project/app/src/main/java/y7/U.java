package y7;

import java.util.List;

/* loaded from: classes.dex */
public final class U extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27194a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27195b;

    /* renamed from: c, reason: collision with root package name */
    public final List f27196c;

    /* renamed from: d, reason: collision with root package name */
    public final y0 f27197d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27198e;

    public U(String str, String str2, List list, y0 y0Var, int i7) {
        this.f27194a = str;
        this.f27195b = str2;
        this.f27196c = list;
        this.f27197d = y0Var;
        this.f27198e = i7;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        if (this.f27194a.equals(((U) y0Var).f27194a) && ((str = this.f27195b) != null ? str.equals(((U) y0Var).f27195b) : ((U) y0Var).f27195b == null)) {
            U u3 = (U) y0Var;
            if (this.f27196c.equals(u3.f27196c)) {
                y0 y0Var2 = u3.f27197d;
                y0 y0Var3 = this.f27197d;
                if (y0Var3 != null ? y0Var3.equals(y0Var2) : y0Var2 == null) {
                    if (this.f27198e == u3.f27198e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f27194a.hashCode() ^ 1000003) * 1000003;
        String str = this.f27195b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f27196c.hashCode()) * 1000003;
        y0 y0Var = this.f27197d;
        return ((hashCode2 ^ (y0Var != null ? y0Var.hashCode() : 0)) * 1000003) ^ this.f27198e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f27194a);
        sb2.append(", reason=");
        sb2.append(this.f27195b);
        sb2.append(", frames=");
        sb2.append(this.f27196c);
        sb2.append(", causedBy=");
        sb2.append(this.f27197d);
        sb2.append(", overflowCount=");
        return A3.c.k(sb2, this.f27198e, "}");
    }
}
