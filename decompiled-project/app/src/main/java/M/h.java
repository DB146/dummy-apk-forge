package M;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import y7.u0;

/* loaded from: classes.dex */
public final class h extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final int f6494a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6495b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6496c;

    /* renamed from: d, reason: collision with root package name */
    public final q3.c f6497d;

    /* renamed from: e, reason: collision with root package name */
    public int f6498e;

    public h(Context context) {
        super(context);
        this.f6494a = 5;
        ArrayList arrayList = new ArrayList();
        this.f6495b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f6496c = arrayList2;
        this.f6497d = new q3.c(15, (byte) 0);
        setClipChildren(false);
        View view = new View(context);
        addView(view);
        arrayList.add(view);
        arrayList2.add(view);
        this.f6498e = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j a(i iVar) {
        View view;
        q3.c cVar = this.f6497d;
        j jVar = (j) ((LinkedHashMap) cVar.f23371b).get(iVar);
        if (jVar != null) {
            return jVar;
        }
        ArrayList arrayList = this.f6496c;
        kotlin.jvm.internal.l.e(arrayList, "<this>");
        j jVar2 = (j) (arrayList.isEmpty() ? null : arrayList.remove(0));
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f23371b;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) cVar.f23372c;
        j jVar3 = jVar2;
        if (jVar2 == null) {
            int i7 = this.f6498e;
            ArrayList arrayList2 = this.f6495b;
            if (i7 > u0.s(arrayList2)) {
                View view2 = new View(getContext());
                addView(view2);
                arrayList2.add(view2);
                view = view2;
            } else {
                j jVar4 = (j) arrayList2.get(this.f6498e);
                i iVar2 = (i) linkedHashMap2.get(jVar4);
                view = jVar4;
                if (iVar2 != null) {
                    iVar2.N();
                    j jVar5 = (j) linkedHashMap.get(iVar2);
                    if (jVar5 != null) {
                    }
                    linkedHashMap.remove(iVar2);
                    jVar4.c();
                    view = jVar4;
                }
            }
            int i10 = this.f6498e;
            if (i10 < this.f6494a - 1) {
                this.f6498e = i10 + 1;
                jVar3 = view;
            } else {
                this.f6498e = 0;
                jVar3 = view;
            }
        }
        linkedHashMap.put(iVar, jVar3);
        linkedHashMap2.put(jVar3, iVar);
        return jVar3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
