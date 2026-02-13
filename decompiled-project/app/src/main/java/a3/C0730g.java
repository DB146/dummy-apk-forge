package a3;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.kt.apps.media.xemtv.beta.R;
import java.util.HashMap;

/* renamed from: a3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0730g extends u {

    /* renamed from: T, reason: collision with root package name */
    public static final String[] f12539T = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: S, reason: collision with root package name */
    public final int f12540S;

    public C0730g() {
        this.f12540S = 3;
    }

    public C0730g(int i7) {
        this();
        this.f12540S = i7;
    }

    public static void O(C0712D c0712d) {
        int visibility = c0712d.f12499b.getVisibility();
        HashMap hashMap = c0712d.f12498a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = c0712d.f12499b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float Q(C0712D c0712d, float f4) {
        Float f10;
        return (c0712d == null || (f10 = (Float) c0712d.f12498a.get("android:fade:transitionAlpha")) == null) ? f4 : f10.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, a3.O] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0723O R(C0712D c0712d, C0712D c0712d2) {
        ?? obj = new Object();
        obj.f12519c = false;
        obj.f12520d = false;
        if (c0712d != null) {
            HashMap hashMap = c0712d.f12498a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                obj.f12517a = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                obj.f12521e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (c0712d2 != null) {
                    HashMap hashMap2 = c0712d2.f12498a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        obj.f12518b = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        obj.f12522f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (c0712d == null && c0712d2 != null) {
                            int i7 = obj.f12517a;
                            int i10 = obj.f12518b;
                            if (i7 == i10 && ((ViewGroup) obj.f12521e) == ((ViewGroup) obj.f12522f)) {
                                return obj;
                            }
                            if (i7 != i10) {
                                if (i7 == 0) {
                                    obj.f12520d = false;
                                    obj.f12519c = true;
                                } else if (i10 == 0) {
                                    obj.f12520d = true;
                                    obj.f12519c = true;
                                }
                            } else if (((ViewGroup) obj.f12522f) == null) {
                                obj.f12520d = false;
                                obj.f12519c = true;
                            } else if (((ViewGroup) obj.f12521e) == null) {
                                obj.f12520d = true;
                                obj.f12519c = true;
                            }
                        } else if (c0712d != null && obj.f12518b == 0) {
                            obj.f12520d = true;
                            obj.f12519c = true;
                        } else if (c0712d2 == null && obj.f12517a == 0) {
                            obj.f12520d = false;
                            obj.f12519c = true;
                        }
                        return obj;
                    }
                }
                obj.f12518b = -1;
                obj.f12522f = null;
                if (c0712d == null) {
                }
                if (c0712d != null) {
                }
                if (c0712d2 == null) {
                    obj.f12520d = false;
                    obj.f12519c = true;
                }
                return obj;
            }
        }
        obj.f12517a = -1;
        obj.f12521e = null;
        if (c0712d2 != null) {
        }
        obj.f12518b = -1;
        obj.f12522f = null;
        if (c0712d == null) {
        }
        if (c0712d != null) {
        }
        if (c0712d2 == null) {
        }
        return obj;
    }

    public final ObjectAnimator P(View view, float f4, float f10) {
        if (f4 == f10) {
            return null;
        }
        AbstractC0714F.f12501a.D(view, f4);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, AbstractC0714F.f12502b, f10);
        C0729f c0729f = new C0729f(view);
        ofFloat.addListener(c0729f);
        p().a(c0729f);
        return ofFloat;
    }

    @Override // a3.u
    public final void e(C0712D c0712d) {
        O(c0712d);
    }

    @Override // a3.u
    public final void h(C0712D c0712d) {
        O(c0712d);
        View view = c0712d.f12499b;
        Float f4 = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f4 == null) {
            f4 = view.getVisibility() == 0 ? Float.valueOf(AbstractC0714F.f12501a.x(view)) : Float.valueOf(0.0f);
        }
        c0712d.f12498a.put("android:fade:transitionAlpha", f4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (R(o(r3, false), s(r3, false)).f12519c != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d5  */
    @Override // a3.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator l(ViewGroup viewGroup, C0712D c0712d, C0712D c0712d2) {
        boolean z8;
        View view;
        int i7;
        View view2;
        View view3;
        ViewGroup viewGroup2;
        int i10;
        Bitmap bitmap;
        int i11 = this.f12540S;
        C0723O R10 = R(c0712d, c0712d2);
        if (!R10.f12519c || (((ViewGroup) R10.f12521e) == null && ((ViewGroup) R10.f12522f) == null)) {
            return null;
        }
        boolean z10 = false;
        if (R10.f12520d) {
            if ((i11 & 1) == 1 && c0712d2 != null) {
                View view4 = c0712d2.f12499b;
                if (c0712d == null) {
                    View view5 = (View) view4.getParent();
                }
                AbstractC0714F.f12501a.getClass();
                return P(view4, Q(c0712d, 0.0f), 1.0f);
            }
            return null;
        }
        int i12 = R10.f12518b;
        if ((i11 & 2) == 2 && c0712d != null) {
            View view6 = c0712d2 != null ? c0712d2.f12499b : null;
            View view7 = c0712d.f12499b;
            View view8 = (View) view7.getTag(R.id.save_overlay_view);
            if (view8 != null) {
                i7 = i12;
                z10 = true;
                view3 = null;
            } else {
                if (view6 == null || view6.getParent() == null) {
                    if (view6 != null) {
                        z8 = false;
                        view = null;
                        if (z8) {
                            if (view7.getParent() == null) {
                                i7 = i12;
                                view3 = view;
                                view8 = view7;
                            } else if (view7.getParent() instanceof View) {
                                View view9 = (View) view7.getParent();
                                if (R(s(view9, true), o(view9, true)).f12519c) {
                                    i7 = i12;
                                    view2 = view;
                                    int id = view9.getId();
                                    if (view9.getParent() == null && id != -1) {
                                        viewGroup.findViewById(id);
                                    }
                                    view8 = view6;
                                    view3 = view2;
                                    z10 = false;
                                } else {
                                    boolean z11 = AbstractC0711C.f12497a;
                                    Matrix matrix = new Matrix();
                                    matrix.setTranslate(-view9.getScrollX(), -view9.getScrollY());
                                    C0719K c0719k = AbstractC0714F.f12501a;
                                    c0719k.K(view7, matrix);
                                    c0719k.L(viewGroup, matrix);
                                    RectF rectF = new RectF(0.0f, 0.0f, view7.getWidth(), view7.getHeight());
                                    matrix.mapRect(rectF);
                                    int round = Math.round(rectF.left);
                                    int round2 = Math.round(rectF.top);
                                    int round3 = Math.round(rectF.right);
                                    int round4 = Math.round(rectF.bottom);
                                    ImageView imageView = new ImageView(view7.getContext());
                                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    boolean isAttachedToWindow = view7.isAttachedToWindow();
                                    boolean z12 = viewGroup != null && viewGroup.isAttachedToWindow();
                                    if (isAttachedToWindow) {
                                        view2 = view;
                                        viewGroup2 = null;
                                        i10 = 0;
                                    } else if (z12) {
                                        ViewGroup viewGroup3 = (ViewGroup) view7.getParent();
                                        int indexOfChild = viewGroup3.indexOfChild(view7);
                                        viewGroup.getOverlay().add(view7);
                                        viewGroup2 = viewGroup3;
                                        view2 = view;
                                        i10 = indexOfChild;
                                    } else {
                                        i7 = i12;
                                        view2 = view;
                                        bitmap = null;
                                        if (bitmap != null) {
                                            imageView.setImageBitmap(bitmap);
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                        imageView.layout(round, round2, round3, round4);
                                        view8 = imageView;
                                        view3 = view2;
                                        z10 = false;
                                    }
                                    i7 = i12;
                                    int round5 = Math.round(rectF.width());
                                    int round6 = Math.round(rectF.height());
                                    if (round5 <= 0 || round6 <= 0) {
                                        bitmap = null;
                                    } else {
                                        float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                                        int round7 = Math.round(round5 * min);
                                        int round8 = Math.round(round6 * min);
                                        matrix.postTranslate(-rectF.left, -rectF.top);
                                        matrix.postScale(min, min);
                                        if (AbstractC0711C.f12497a) {
                                            Picture picture = new Picture();
                                            Canvas beginRecording = picture.beginRecording(round7, round8);
                                            beginRecording.concat(matrix);
                                            view7.draw(beginRecording);
                                            picture.endRecording();
                                            bitmap = AbstractC0710B.a(picture);
                                        } else {
                                            bitmap = Bitmap.createBitmap(round7, round8, Bitmap.Config.ARGB_8888);
                                            Canvas canvas = new Canvas(bitmap);
                                            canvas.concat(matrix);
                                            view7.draw(canvas);
                                        }
                                    }
                                    if (!isAttachedToWindow) {
                                        viewGroup.getOverlay().remove(view7);
                                        viewGroup2.addView(view7, i10);
                                    }
                                    if (bitmap != null) {
                                    }
                                    imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                    imageView.layout(round, round2, round3, round4);
                                    view8 = imageView;
                                    view3 = view2;
                                    z10 = false;
                                }
                            }
                        }
                        i7 = i12;
                        view2 = view;
                        view8 = view6;
                        view3 = view2;
                        z10 = false;
                    }
                } else if (i12 == 4 || view7 == view6) {
                    view = view6;
                    z8 = false;
                    view6 = null;
                    if (z8) {
                    }
                    i7 = i12;
                    view2 = view;
                    view8 = view6;
                    view3 = view2;
                    z10 = false;
                }
                z8 = true;
                view6 = null;
                view = null;
                if (z8) {
                }
                i7 = i12;
                view2 = view;
                view8 = view6;
                view3 = view2;
                z10 = false;
            }
            if (view8 != null) {
                if (!z10) {
                    int[] iArr = (int[]) c0712d.f12498a.get("android:visibility:screenLocation");
                    int i13 = iArr[0];
                    int i14 = iArr[1];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr2);
                    view8.offsetLeftAndRight((i13 - iArr2[0]) - view8.getLeft());
                    view8.offsetTopAndBottom((i14 - iArr2[1]) - view8.getTop());
                    viewGroup.getOverlay().add(view8);
                }
                C0719K c0719k2 = AbstractC0714F.f12501a;
                c0719k2.getClass();
                ObjectAnimator P10 = P(view8, Q(c0712d, 1.0f), 0.0f);
                if (P10 == null) {
                    c0719k2.D(view8, Q(c0712d2, 1.0f));
                }
                if (z10) {
                    return P10;
                }
                if (P10 == null) {
                    viewGroup.getOverlay().remove(view8);
                    return P10;
                }
                view7.setTag(R.id.save_overlay_view, view8);
                C0722N c0722n = new C0722N(this, viewGroup, view8, view7);
                P10.addListener(c0722n);
                P10.addPauseListener(c0722n);
                p().a(c0722n);
                return P10;
            }
            if (view3 != null) {
                int visibility = view3.getVisibility();
                AbstractC0714F.b(view3, 0);
                C0719K c0719k3 = AbstractC0714F.f12501a;
                c0719k3.getClass();
                ObjectAnimator P11 = P(view3, Q(c0712d, 1.0f), 0.0f);
                if (P11 == null) {
                    c0719k3.D(view3, Q(c0712d2, 1.0f));
                }
                if (P11 != null) {
                    C0721M c0721m = new C0721M(view3, i7);
                    P11.addListener(c0721m);
                    p().a(c0721m);
                } else {
                    AbstractC0714F.b(view3, visibility);
                }
                return P11;
            }
        }
        return null;
    }

    @Override // a3.u
    public final String[] r() {
        return f12539T;
    }

    @Override // a3.u
    public final boolean u() {
        return true;
    }

    @Override // a3.u
    public final boolean v(C0712D c0712d, C0712D c0712d2) {
        if (c0712d == null && c0712d2 == null) {
            return false;
        }
        if (c0712d != null && c0712d2 != null && c0712d2.f12498a.containsKey("android:visibility:visibility") != c0712d.f12498a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C0723O R10 = R(c0712d, c0712d2);
        if (R10.f12519c) {
            return R10.f12517a == 0 || R10.f12518b == 0;
        }
        return false;
    }
}
