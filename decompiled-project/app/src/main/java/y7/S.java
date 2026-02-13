package y7;

import java.util.List;

/* loaded from: classes.dex */
public final class S extends C0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f27185a;

    /* renamed from: b, reason: collision with root package name */
    public final U f27186b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f27187c;

    /* renamed from: d, reason: collision with root package name */
    public final V f27188d;

    /* renamed from: e, reason: collision with root package name */
    public final List f27189e;

    public S(List list, U u3, q0 q0Var, V v10, List list2) {
        this.f27185a = list;
        this.f27186b = u3;
        this.f27187c = q0Var;
        this.f27188d = v10;
        this.f27189e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        List list = this.f27185a;
        if (list != null ? list.equals(((S) c02).f27185a) : ((S) c02).f27185a == null) {
            U u3 = this.f27186b;
            if (u3 != null ? u3.equals(((S) c02).f27186b) : ((S) c02).f27186b == null) {
                q0 q0Var = this.f27187c;
                if (q0Var != null ? q0Var.equals(((S) c02).f27187c) : ((S) c02).f27187c == null) {
                    S s3 = (S) c02;
                    if (this.f27188d.equals(s3.f27188d) && this.f27189e.equals(s3.f27189e)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.f27185a;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        U u3 = this.f27186b;
        int hashCode2 = (hashCode ^ (u3 == null ? 0 : u3.hashCode())) * 1000003;
        q0 q0Var = this.f27187c;
        return (((((q0Var != null ? q0Var.hashCode() : 0) ^ hashCode2) * 1000003) ^ this.f27188d.hashCode()) * 1000003) ^ this.f27189e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f27185a + ", exception=" + this.f27186b + ", appExitInfo=" + this.f27187c + ", signal=" + this.f27188d + ", binaries=" + this.f27189e + "}";
    }
}
