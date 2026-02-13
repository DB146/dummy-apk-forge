package a1;

/* loaded from: classes.dex */
public final class k extends AbstractC0707h {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ l f12475v;

    public k(l lVar) {
        this.f12475v = lVar;
    }

    @Override // a1.AbstractC0707h
    public final String o() {
        i iVar = (i) this.f12475v.f12476a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f12471a + "]";
    }
}
