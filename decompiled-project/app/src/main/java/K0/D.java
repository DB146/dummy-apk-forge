package K0;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final x f5847a;

    /* renamed from: b, reason: collision with root package name */
    public final x f5848b;

    /* renamed from: c, reason: collision with root package name */
    public final x f5849c;

    /* renamed from: d, reason: collision with root package name */
    public final x f5850d;

    public D(x xVar, x xVar2, x xVar3, x xVar4) {
        this.f5847a = xVar;
        this.f5848b = xVar2;
        this.f5849c = xVar3;
        this.f5850d = xVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        return kotlin.jvm.internal.l.a(this.f5847a, d10.f5847a) && kotlin.jvm.internal.l.a(this.f5848b, d10.f5848b) && kotlin.jvm.internal.l.a(this.f5849c, d10.f5849c) && kotlin.jvm.internal.l.a(this.f5850d, d10.f5850d);
    }

    public final int hashCode() {
        x xVar = this.f5847a;
        int hashCode = (xVar != null ? xVar.hashCode() : 0) * 31;
        x xVar2 = this.f5848b;
        int hashCode2 = (hashCode + (xVar2 != null ? xVar2.hashCode() : 0)) * 31;
        x xVar3 = this.f5849c;
        int hashCode3 = (hashCode2 + (xVar3 != null ? xVar3.hashCode() : 0)) * 31;
        x xVar4 = this.f5850d;
        return hashCode3 + (xVar4 != null ? xVar4.hashCode() : 0);
    }
}
