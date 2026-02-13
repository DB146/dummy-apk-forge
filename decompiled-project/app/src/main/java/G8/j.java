package G8;

/* loaded from: classes.dex */
public final class j extends z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4375a;

    @Override // G8.z
    public final Object b(O8.a aVar) {
        switch (this.f4375a) {
            case 0:
                if (aVar.j0() != 9) {
                    return Double.valueOf(aVar.a0());
                }
                aVar.f0();
                return null;
            case 1:
                if (aVar.j0() != 9) {
                    return Float.valueOf((float) aVar.a0());
                }
                aVar.f0();
                return null;
            default:
                aVar.p0();
                return null;
        }
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        switch (this.f4375a) {
            case 0:
                Number number = (Number) obj;
                if (number == null) {
                    bVar.W();
                    return;
                }
                double doubleValue = number.doubleValue();
                m.a(doubleValue);
                bVar.b0(doubleValue);
                return;
            case 1:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    bVar.W();
                    return;
                }
                float floatValue = number2.floatValue();
                m.a(floatValue);
                if (!(number2 instanceof Float)) {
                    number2 = Float.valueOf(floatValue);
                }
                bVar.d0(number2);
                return;
            default:
                bVar.W();
                return;
        }
    }

    public String toString() {
        switch (this.f4375a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
