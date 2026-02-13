package m6;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import i1.C1290a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import y1.K;

/* renamed from: m6.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC1634j implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f20752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChipGroup f20753b;

    public ViewGroupOnHierarchyChangeListenerC1634j(ChipGroup chipGroup) {
        this.f20753b = chipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.f20753b;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                WeakHashMap weakHashMap = K.f26642a;
                view2.setId(View.generateViewId());
            }
            Chip chip = (Chip) view2;
            U2.b bVar = chipGroup.f15288v;
            ((HashMap) bVar.f9508c).put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                bVar.b(chip);
            }
            chip.setInternalOnCheckedChangeListener(new C1290a(bVar, 21));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f20752a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        ChipGroup chipGroup = this.f20753b;
        if (view == chipGroup && (view2 instanceof Chip)) {
            Chip chip = (Chip) view2;
            U2.b bVar = chipGroup.f15288v;
            bVar.getClass();
            chip.setInternalOnCheckedChangeListener(null);
            ((HashMap) bVar.f9508c).remove(Integer.valueOf(chip.getId()));
            ((HashSet) bVar.f9509d).remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f20752a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
