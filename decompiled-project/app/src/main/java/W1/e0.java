package W1;

import A9.C0084f1;
import android.graphics.Rect;
import android.transition.Transition;

/* loaded from: classes.dex */
public final class e0 extends Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10469a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10470b;

    public /* synthetic */ e0(Object obj, int i7) {
        this.f10469a = i7;
        this.f10470b = obj;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        switch (this.f10469a) {
            case 0:
                return (Rect) this.f10470b;
            case 1:
                Rect rect = (Rect) this.f10470b;
                if (rect == null || rect.isEmpty()) {
                    return null;
                }
                return rect;
            default:
                q3.s sVar = (q3.s) this.f10470b;
                int height = (int) ((((C0084f1) sVar.f23439c).f1155t * r0.f1140b.getHeight()) / 100.0f);
                Rect rect2 = (Rect) sVar.f23438b;
                rect2.set(0, height, 0, height);
                return rect2;
        }
    }
}
