package A9;

import a3.AbstractC0714F;
import a3.C0727d;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.base.leanback.PagingIndicator;
import d2.C1041a;
import d2.C1043c;

/* loaded from: classes2.dex */
public final class Q1 extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f940a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q1(int i7, Class cls, String str) {
        super(cls, str);
        this.f940a = i7;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f940a) {
            case 0:
                return Float.valueOf(((R1) obj).f946a);
            case 1:
                return Float.valueOf(((R1) obj).f950e);
            case 2:
                return Float.valueOf(((R1) obj).f948c);
            case 3:
                return Integer.valueOf(((m3) obj).getStreamPosition());
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return null;
            case 7:
                return null;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return null;
            case 9:
                return Float.valueOf(AbstractC0714F.f12501a.x((View) obj));
            case 10:
                return ((View) obj).getClipBounds();
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                C1043c c1043c = (C1043c) obj;
                C1041a c1041a = (C1041a) c1043c.f16491a.f23397c;
                return c1041a == null ? Integer.valueOf(c1043c.f16494d.getBounds().top) : Integer.valueOf(c1041a.f16485b);
            case 12:
                C1043c c1043c2 = (C1043c) obj;
                C1041a c1041a2 = (C1041a) c1043c2.f16491a.f23399e;
                return c1041a2 == null ? Integer.valueOf(c1043c2.f16494d.getBounds().bottom) : Integer.valueOf(c1041a2.f16485b);
            case 13:
                C1043c c1043c3 = (C1043c) obj;
                C1041a c1041a3 = (C1041a) c1043c3.f16491a.f23396b;
                return c1041a3 == null ? Integer.valueOf(c1043c3.f16494d.getBounds().left) : Integer.valueOf(c1041a3.f16485b);
            case 14:
                C1043c c1043c4 = (C1043c) obj;
                C1041a c1041a4 = (C1041a) c1043c4.f16491a.f23398d;
                return c1041a4 == null ? Integer.valueOf(c1043c4.f16494d.getBounds().right) : Integer.valueOf(c1041a4.f16485b);
            case 15:
                C1041a c1041a5 = (C1041a) ((C1043c) obj).f16491a.f23397c;
                return c1041a5 == null ? Float.valueOf(0.0f) : Float.valueOf(c1041a5.f16484a);
            case 16:
                C1041a c1041a6 = (C1041a) ((C1043c) obj).f16491a.f23399e;
                return c1041a6 == null ? Float.valueOf(1.0f) : Float.valueOf(c1041a6.f16484a);
            case 17:
                C1041a c1041a7 = (C1041a) ((C1043c) obj).f16491a.f23396b;
                return c1041a7 == null ? Float.valueOf(0.0f) : Float.valueOf(c1041a7.f16484a);
            case 18:
                C1041a c1041a8 = (C1041a) ((C1043c) obj).f16491a.f23398d;
                return c1041a8 == null ? Float.valueOf(1.0f) : Float.valueOf(c1041a8.f16484a);
            default:
                return Float.valueOf(((SwitchCompat) obj).f13028N);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f940a) {
            case 0:
                R1 r12 = (R1) obj;
                r12.f946a = ((Float) obj2).floatValue();
                r12.a();
                r12.j.invalidate();
                return;
            case 1:
                R1 r13 = (R1) obj;
                float floatValue = ((Float) obj2).floatValue();
                r13.f950e = floatValue;
                float f4 = floatValue / 2.0f;
                r13.f951f = f4;
                PagingIndicator pagingIndicator = r13.j;
                r13.g = f4 * pagingIndicator.f15985J;
                pagingIndicator.invalidate();
                return;
            case 2:
                R1 r14 = (R1) obj;
                r14.f948c = ((Float) obj2).floatValue() * r14.f952h * r14.f953i;
                r14.j.invalidate();
                return;
            case 3:
                ((m3) obj).setStreamPosition(((Integer) obj2).intValue());
                return;
            case 4:
                C0727d c0727d = (C0727d) obj;
                PointF pointF = (PointF) obj2;
                c0727d.getClass();
                c0727d.f12525a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c0727d.f12526b = round;
                int i7 = c0727d.f12530f + 1;
                c0727d.f12530f = i7;
                if (i7 == c0727d.g) {
                    AbstractC0714F.a(c0727d.f12529e, c0727d.f12525a, round, c0727d.f12527c, c0727d.f12528d);
                    c0727d.f12530f = 0;
                    c0727d.g = 0;
                    return;
                }
                return;
            case 5:
                C0727d c0727d2 = (C0727d) obj;
                PointF pointF2 = (PointF) obj2;
                c0727d2.getClass();
                c0727d2.f12527c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                c0727d2.f12528d = round2;
                int i10 = c0727d2.g + 1;
                c0727d2.g = i10;
                if (c0727d2.f12530f == i10) {
                    AbstractC0714F.a(c0727d2.f12529e, c0727d2.f12525a, c0727d2.f12526b, c0727d2.f12527c, round2);
                    c0727d2.f12530f = 0;
                    c0727d2.g = 0;
                    return;
                }
                return;
            case 6:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC0714F.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                return;
            case 7:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC0714F.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                AbstractC0714F.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                return;
            case 9:
                float floatValue2 = ((Float) obj2).floatValue();
                AbstractC0714F.f12501a.D((View) obj, floatValue2);
                return;
            case 10:
                ((View) obj).setClipBounds((Rect) obj2);
                return;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                C1043c c1043c = (C1043c) obj;
                Integer num = (Integer) obj2;
                q3.n nVar = c1043c.f16491a;
                C1041a c1041a = (C1041a) nVar.f23397c;
                if (c1041a == null) {
                    nVar.f23397c = new C1041a(num.intValue(), 0.0f);
                } else {
                    c1041a.f16485b = num.intValue();
                }
                c1043c.a();
                return;
            case 12:
                C1043c c1043c2 = (C1043c) obj;
                Integer num2 = (Integer) obj2;
                q3.n nVar2 = c1043c2.f16491a;
                C1041a c1041a2 = (C1041a) nVar2.f23399e;
                if (c1041a2 == null) {
                    nVar2.f23399e = new C1041a(num2.intValue(), 0.0f);
                } else {
                    c1041a2.f16485b = num2.intValue();
                }
                c1043c2.a();
                return;
            case 13:
                C1043c c1043c3 = (C1043c) obj;
                Integer num3 = (Integer) obj2;
                q3.n nVar3 = c1043c3.f16491a;
                C1041a c1041a3 = (C1041a) nVar3.f23396b;
                if (c1041a3 == null) {
                    nVar3.f23396b = new C1041a(num3.intValue(), 0.0f);
                } else {
                    c1041a3.f16485b = num3.intValue();
                }
                c1043c3.a();
                return;
            case 14:
                C1043c c1043c4 = (C1043c) obj;
                Integer num4 = (Integer) obj2;
                q3.n nVar4 = c1043c4.f16491a;
                C1041a c1041a4 = (C1041a) nVar4.f23398d;
                if (c1041a4 == null) {
                    nVar4.f23398d = new C1041a(num4.intValue(), 0.0f);
                } else {
                    c1041a4.f16485b = num4.intValue();
                }
                c1043c4.a();
                return;
            case 15:
                C1043c c1043c5 = (C1043c) obj;
                Float f10 = (Float) obj2;
                q3.n nVar5 = c1043c5.f16491a;
                C1041a c1041a5 = (C1041a) nVar5.f23397c;
                if (c1041a5 == null) {
                    nVar5.f23397c = new C1041a(0, f10.floatValue());
                } else {
                    c1041a5.f16484a = f10.floatValue();
                }
                c1043c5.a();
                return;
            case 16:
                C1043c c1043c6 = (C1043c) obj;
                Float f11 = (Float) obj2;
                q3.n nVar6 = c1043c6.f16491a;
                C1041a c1041a6 = (C1041a) nVar6.f23399e;
                if (c1041a6 == null) {
                    nVar6.f23399e = new C1041a(0, f11.floatValue());
                } else {
                    c1041a6.f16484a = f11.floatValue();
                }
                c1043c6.a();
                return;
            case 17:
                C1043c c1043c7 = (C1043c) obj;
                Float f12 = (Float) obj2;
                q3.n nVar7 = c1043c7.f16491a;
                C1041a c1041a7 = (C1041a) nVar7.f23396b;
                if (c1041a7 == null) {
                    nVar7.f23396b = new C1041a(0, f12.floatValue());
                } else {
                    c1041a7.f16484a = f12.floatValue();
                }
                c1043c7.a();
                return;
            case 18:
                C1043c c1043c8 = (C1043c) obj;
                Float f13 = (Float) obj2;
                q3.n nVar8 = c1043c8.f16491a;
                C1041a c1041a8 = (C1041a) nVar8.f23398d;
                if (c1041a8 == null) {
                    nVar8.f23398d = new C1041a(0, f13.floatValue());
                } else {
                    c1041a8.f16484a = f13.floatValue();
                }
                c1043c8.a();
                return;
            default:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                return;
        }
    }
}
