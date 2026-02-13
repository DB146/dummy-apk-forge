package W1;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: W1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0564g extends C9.h {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10474b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10475c;

    /* renamed from: d, reason: collision with root package name */
    public q3.e f10476d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0564g(o0 operation, boolean z8) {
        super(operation);
        kotlin.jvm.internal.l.e(operation, "operation");
        this.f10474b = z8;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:59|(3:73|74|(4:76|65|27|28))|61|62|(4:64|65|27|28)) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ef, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f0, code lost:
    
        if (r0 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f2, code lost:
    
        r9 = android.view.animation.AnimationUtils.loadAnimation(r9, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f6, code lost:
    
        if (r9 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f8, code lost:
    
        r9 = new q3.e(r9, 20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0101, code lost:
    
        throw r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q3.e K(Context context) {
        int i7;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Animation loadAnimation;
        q3.e eVar;
        q3.e eVar2;
        if (this.f10475c) {
            return this.f10476d;
        }
        o0 o0Var = (o0) this.f3094a;
        C c10 = o0Var.f10533c;
        boolean z8 = o0Var.f10531a == 2;
        C0582z c0582z = c10.f10280X;
        int i10 = c0582z == null ? 0 : c0582z.f10581f;
        if (!this.f10474b) {
            if (z8) {
                if (c0582z != null) {
                    i7 = c0582z.f10577b;
                    c10.k0(0, 0, 0, 0);
                    viewGroup = c10.f10276T;
                    if (viewGroup != null) {
                    }
                    viewGroup2 = c10.f10276T;
                    if (viewGroup2 != null) {
                    }
                    if (i7 == 0) {
                    }
                    if (i7 != 0) {
                    }
                    eVar2 = null;
                    this.f10476d = eVar2;
                    this.f10475c = true;
                    return eVar2;
                }
                i7 = 0;
                c10.k0(0, 0, 0, 0);
                viewGroup = c10.f10276T;
                if (viewGroup != null) {
                }
                viewGroup2 = c10.f10276T;
                if (viewGroup2 != null) {
                }
                if (i7 == 0) {
                }
                if (i7 != 0) {
                }
                eVar2 = null;
                this.f10476d = eVar2;
                this.f10475c = true;
                return eVar2;
            }
            if (c0582z != null) {
                i7 = c0582z.f10578c;
                c10.k0(0, 0, 0, 0);
                viewGroup = c10.f10276T;
                if (viewGroup != null) {
                }
                viewGroup2 = c10.f10276T;
                if (viewGroup2 != null) {
                }
                if (i7 == 0) {
                }
                if (i7 != 0) {
                }
                eVar2 = null;
                this.f10476d = eVar2;
                this.f10475c = true;
                return eVar2;
            }
            i7 = 0;
            c10.k0(0, 0, 0, 0);
            viewGroup = c10.f10276T;
            if (viewGroup != null) {
            }
            viewGroup2 = c10.f10276T;
            if (viewGroup2 != null) {
            }
            if (i7 == 0) {
            }
            if (i7 != 0) {
            }
            eVar2 = null;
            this.f10476d = eVar2;
            this.f10475c = true;
            return eVar2;
        }
        if (!z8) {
            if (c0582z != null) {
                i7 = c0582z.f10580e;
                c10.k0(0, 0, 0, 0);
                viewGroup = c10.f10276T;
                if (viewGroup != null) {
                }
                viewGroup2 = c10.f10276T;
                if (viewGroup2 != null) {
                }
                if (i7 == 0) {
                }
                if (i7 != 0) {
                }
                eVar2 = null;
                this.f10476d = eVar2;
                this.f10475c = true;
                return eVar2;
            }
            i7 = 0;
            c10.k0(0, 0, 0, 0);
            viewGroup = c10.f10276T;
            if (viewGroup != null) {
            }
            viewGroup2 = c10.f10276T;
            if (viewGroup2 != null) {
            }
            if (i7 == 0) {
            }
            if (i7 != 0) {
            }
            eVar2 = null;
            this.f10476d = eVar2;
            this.f10475c = true;
            return eVar2;
        }
        if (c0582z != null) {
            i7 = c0582z.f10579d;
            c10.k0(0, 0, 0, 0);
            viewGroup = c10.f10276T;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                c10.f10276T.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            viewGroup2 = c10.f10276T;
            if (viewGroup2 != null || viewGroup2.getLayoutTransition() == null) {
                if (i7 == 0 && i10 != 0) {
                    i7 = i10 == 4097 ? i10 != 8194 ? i10 != 8197 ? i10 != 4099 ? i10 != 4100 ? -1 : z8 ? q3.f.C(context, android.R.attr.activityOpenEnterAnimation) : q3.f.C(context, android.R.attr.activityOpenExitAnimation) : z8 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z8 ? q3.f.C(context, android.R.attr.activityCloseEnterAnimation) : q3.f.C(context, android.R.attr.activityCloseExitAnimation) : z8 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z8 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                }
                if (i7 != 0) {
                    boolean equals = "anim".equals(context.getResources().getResourceTypeName(i7));
                    if (equals) {
                        try {
                            loadAnimation = AnimationUtils.loadAnimation(context, i7);
                        } catch (Resources.NotFoundException e2) {
                            throw e2;
                        } catch (RuntimeException unused) {
                        }
                        if (loadAnimation != null) {
                            eVar = new q3.e(loadAnimation, 20);
                            eVar2 = eVar;
                            this.f10476d = eVar2;
                            this.f10475c = true;
                            return eVar2;
                        }
                    }
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, i7);
                    if (loadAnimator != null) {
                        eVar = new q3.e(loadAnimator);
                        eVar2 = eVar;
                        this.f10476d = eVar2;
                        this.f10475c = true;
                        return eVar2;
                    }
                }
            }
            eVar2 = null;
            this.f10476d = eVar2;
            this.f10475c = true;
            return eVar2;
        }
        i7 = 0;
        c10.k0(0, 0, 0, 0);
        viewGroup = c10.f10276T;
        if (viewGroup != null) {
            c10.f10276T.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        viewGroup2 = c10.f10276T;
        if (viewGroup2 != null) {
        }
        if (i7 == 0) {
            i7 = i10 == 4097 ? i10 != 8194 ? i10 != 8197 ? i10 != 4099 ? i10 != 4100 ? -1 : z8 ? q3.f.C(context, android.R.attr.activityOpenEnterAnimation) : q3.f.C(context, android.R.attr.activityOpenExitAnimation) : z8 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z8 ? q3.f.C(context, android.R.attr.activityCloseEnterAnimation) : q3.f.C(context, android.R.attr.activityCloseExitAnimation) : z8 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z8 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
        }
        if (i7 != 0) {
        }
        eVar2 = null;
        this.f10476d = eVar2;
        this.f10475c = true;
        return eVar2;
    }
}
