package l5;

import a5.C0775a;
import a5.C0776b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n5.AbstractC1705a;

/* renamed from: l5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1488b extends View implements L {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f19411a;

    /* renamed from: b, reason: collision with root package name */
    public List f19412b;

    /* renamed from: c, reason: collision with root package name */
    public float f19413c;

    /* renamed from: d, reason: collision with root package name */
    public C1489c f19414d;

    /* renamed from: e, reason: collision with root package name */
    public float f19415e;

    public C1488b(Context context) {
        super(context, null);
        this.f19411a = new ArrayList();
        this.f19412b = Collections.emptyList();
        this.f19413c = 0.0533f;
        this.f19414d = C1489c.g;
        this.f19415e = 0.08f;
    }

    @Override // l5.L
    public final void a(List list, C1489c c1489c, float f4, float f10) {
        this.f19412b = list;
        this.f19414d = c1489c;
        this.f19413c = f4;
        this.f19415e = f10;
        while (true) {
            ArrayList arrayList = this.f19411a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new K(getContext()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04b8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        TextPaint textPaint;
        boolean z8;
        int i15;
        int i16;
        Canvas canvas2;
        float f4;
        boolean z10;
        boolean z11;
        boolean z12;
        float f10;
        int i17;
        float f11;
        int i18;
        int i19;
        int i20;
        int i21;
        C1488b c1488b = this;
        Canvas canvas3 = canvas;
        List list = c1488b.f19412b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i22 = paddingBottom - paddingTop;
        float a02 = com.bumptech.glide.c.a0(c1488b.f19413c, 0, height, i22);
        if (a02 <= 0.0f) {
            return;
        }
        int size = list.size();
        int i23 = 0;
        while (i23 < size) {
            C0776b c0776b = (C0776b) list.get(i23);
            if (c0776b.f12729D != Integer.MIN_VALUE) {
                C0775a a9 = c0776b.a();
                a9.f12700h = -3.4028235E38f;
                a9.f12701i = Integer.MIN_VALUE;
                a9.f12696c = null;
                int i24 = c0776b.f12736f;
                float f12 = c0776b.f12735e;
                if (i24 == 0) {
                    a9.f12698e = 1.0f - f12;
                    a9.f12699f = 0;
                } else {
                    a9.f12698e = (-f12) - 1.0f;
                    a9.f12699f = 1;
                }
                int i25 = c0776b.f12737u;
                if (i25 == 0) {
                    a9.g = 2;
                } else if (i25 == 2) {
                    a9.g = 0;
                }
                c0776b = a9.a();
            }
            float a03 = com.bumptech.glide.c.a0(c0776b.f12728C, c0776b.f12727B, height, i22);
            K k = (K) c1488b.f19411a.get(i23);
            C1489c c1489c = c1488b.f19414d;
            List list2 = list;
            float f13 = c1488b.f19415e;
            k.getClass();
            Bitmap bitmap = c0776b.f12734d;
            int i26 = height;
            int i27 = i22;
            boolean z13 = bitmap == null;
            CharSequence charSequence = c0776b.f12731a;
            if (!z13) {
                i7 = size;
                i10 = -16777216;
            } else if (TextUtils.isEmpty(charSequence)) {
                canvas2 = canvas3;
                i16 = paddingLeft;
                i13 = paddingTop;
                i12 = width;
                i15 = paddingBottom;
                f4 = a02;
                i7 = size;
                i11 = i23;
                z11 = false;
                z12 = false;
                i23 = i11 + 1;
                canvas3 = canvas2;
                list = list2;
                height = i26;
                i22 = i27;
                size = i7;
                a02 = f4;
                paddingBottom = i15;
                width = i12;
                paddingTop = i13;
                paddingLeft = i16;
                c1488b = this;
            } else {
                i7 = size;
                i10 = c0776b.f12742z ? c0776b.f12726A : c1489c.f19418c;
            }
            i11 = i23;
            CharSequence charSequence2 = k.f19386i;
            TextPaint textPaint2 = k.f19384f;
            boolean z14 = z13;
            float f14 = c0776b.f12741y;
            int i28 = paddingBottom;
            float f15 = c0776b.f12740x;
            i12 = width;
            int i29 = c0776b.f12739w;
            i13 = paddingTop;
            float f16 = c0776b.f12738v;
            int i30 = paddingLeft;
            int i31 = c0776b.f12737u;
            int i32 = c0776b.f12736f;
            float f17 = c0776b.f12735e;
            Layout.Alignment alignment = c0776b.f12732b;
            if ((charSequence2 == charSequence || (charSequence2 != null && charSequence2.equals(charSequence))) && n5.D.a(k.j, alignment) && k.k == bitmap && k.f19387l == f17 && k.f19388m == i32) {
                i14 = i32;
                if (Integer.valueOf(k.f19389n).equals(Integer.valueOf(i31)) && k.f19390o == f16 && Integer.valueOf(k.f19391p).equals(Integer.valueOf(i29)) && k.f19392q == f15 && k.f19393r == f14 && k.f19394s == c1489c.f19416a && k.f19395t == c1489c.f19417b && k.f19396u == i10 && k.f19398w == c1489c.f19419d && k.f19397v == c1489c.f19420e && n5.D.a(textPaint2.getTypeface(), c1489c.f19421f) && k.f19399x == a02 && k.f19400y == a03 && k.f19401z == f13) {
                    if (k.f19369A == i30) {
                        if (k.f19370B == i13) {
                            i13 = i13;
                            if (k.f19371C == i12) {
                                i12 = i12;
                                if (k.f19372D == i28) {
                                    i15 = i28;
                                    i16 = i30;
                                    k.a(canvas, z14);
                                    canvas2 = canvas;
                                    f4 = a02;
                                    z11 = false;
                                    z12 = false;
                                    i23 = i11 + 1;
                                    canvas3 = canvas2;
                                    list = list2;
                                    height = i26;
                                    i22 = i27;
                                    size = i7;
                                    a02 = f4;
                                    paddingBottom = i15;
                                    width = i12;
                                    paddingTop = i13;
                                    paddingLeft = i16;
                                    c1488b = this;
                                } else {
                                    i28 = i28;
                                }
                            } else {
                                i12 = i12;
                            }
                        } else {
                            i13 = i13;
                        }
                        i30 = i30;
                        textPaint = textPaint2;
                        z8 = z14;
                    } else {
                        i30 = i30;
                    }
                }
                textPaint = textPaint2;
                z8 = z14;
            } else {
                textPaint = textPaint2;
                i14 = i32;
                z8 = z14;
            }
            k.f19386i = charSequence;
            k.j = alignment;
            k.k = bitmap;
            k.f19387l = f17;
            k.f19388m = i14;
            k.f19389n = i31;
            k.f19390o = f16;
            k.f19391p = i29;
            k.f19392q = f15;
            k.f19393r = f14;
            k.f19394s = c1489c.f19416a;
            k.f19395t = c1489c.f19417b;
            k.f19396u = i10;
            k.f19398w = c1489c.f19419d;
            k.f19397v = c1489c.f19420e;
            textPaint.setTypeface(c1489c.f19421f);
            k.f19399x = a02;
            k.f19400y = a03;
            k.f19401z = f13;
            int i33 = i30;
            k.f19369A = i33;
            int i34 = i13;
            k.f19370B = i34;
            int i35 = i12;
            k.f19371C = i35;
            int i36 = i28;
            k.f19372D = i36;
            if (z8) {
                k.f19386i.getClass();
                CharSequence charSequence3 = k.f19386i;
                SpannableStringBuilder spannableStringBuilder = charSequence3 instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence3 : new SpannableStringBuilder(k.f19386i);
                int i37 = k.f19371C - k.f19369A;
                int i38 = k.f19372D - k.f19370B;
                textPaint.setTextSize(k.f19399x);
                int i39 = (int) ((k.f19399x * 0.125f) + 0.5f);
                int i40 = i39 * 2;
                int i41 = i37 - i40;
                float f18 = k.f19392q;
                if (f18 != -3.4028235E38f) {
                    i41 = (int) (i41 * f18);
                }
                if (i41 <= 0) {
                    AbstractC1705a.S("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
                    i16 = i33;
                    z10 = z8;
                    i13 = i34;
                    i15 = i36;
                    i12 = i35;
                    f4 = a02;
                } else {
                    i16 = i33;
                    i13 = i34;
                    if (k.f19400y > 0.0f) {
                        i15 = i36;
                        i12 = i35;
                        i18 = 0;
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) k.f19400y), 0, spannableStringBuilder.length(), 16711680);
                    } else {
                        i15 = i36;
                        i12 = i35;
                        i18 = 0;
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                    if (k.f19398w == 1) {
                        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i18, spannableStringBuilder2.length(), ForegroundColorSpan.class);
                        int i42 = 0;
                        for (int length = foregroundColorSpanArr.length; i42 < length; length = length) {
                            spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i42]);
                            i42++;
                        }
                    }
                    if (Color.alpha(k.f19395t) > 0) {
                        int i43 = k.f19398w;
                        if (i43 == 0 || i43 == 2) {
                            f4 = a02;
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(k.f19395t), 0, spannableStringBuilder.length(), 16711680);
                        } else {
                            f4 = a02;
                            spannableStringBuilder2.setSpan(new BackgroundColorSpan(k.f19395t), 0, spannableStringBuilder2.length(), 16711680);
                        }
                    } else {
                        f4 = a02;
                    }
                    Layout.Alignment alignment2 = k.j;
                    if (alignment2 == null) {
                        alignment2 = Layout.Alignment.ALIGN_CENTER;
                    }
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, textPaint, i41, alignment2, k.f19382d, k.f19383e, true);
                    k.f19373E = staticLayout;
                    int height2 = staticLayout.getHeight();
                    int lineCount = k.f19373E.getLineCount();
                    z10 = z8;
                    int i44 = 0;
                    int i45 = 0;
                    while (i45 < lineCount) {
                        i44 = Math.max((int) Math.ceil(k.f19373E.getLineWidth(i45)), i44);
                        i45++;
                        lineCount = lineCount;
                        alignment2 = alignment2;
                    }
                    Layout.Alignment alignment3 = alignment2;
                    if (k.f19392q == -3.4028235E38f || i44 >= i41) {
                        i41 = i44;
                    }
                    int i46 = i41 + i40;
                    float f19 = k.f19390o;
                    if (f19 != -3.4028235E38f) {
                        int round = Math.round(i37 * f19);
                        int i47 = k.f19369A;
                        int i48 = round + i47;
                        int i49 = k.f19391p;
                        if (i49 == 1) {
                            i48 = ((i48 * 2) - i46) / 2;
                        } else if (i49 == 2) {
                            i48 -= i46;
                        }
                        i19 = Math.max(i48, i47);
                        i20 = Math.min(i46 + i19, k.f19371C);
                    } else {
                        i19 = k.f19369A + ((i37 - i46) / 2);
                        i20 = i19 + i46;
                    }
                    int i50 = i20 - i19;
                    if (i50 <= 0) {
                        AbstractC1705a.S("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
                    } else {
                        float f20 = k.f19387l;
                        if (f20 != -3.4028235E38f) {
                            if (k.f19388m == 0) {
                                i21 = Math.round(i38 * f20) + k.f19370B;
                                int i51 = k.f19389n;
                                if (i51 == 2) {
                                    i21 -= height2;
                                } else if (i51 == 1) {
                                    i21 = ((i21 * 2) - height2) / 2;
                                }
                                z11 = false;
                                z12 = false;
                            } else {
                                z11 = false;
                                int lineBottom = k.f19373E.getLineBottom(0) - k.f19373E.getLineTop(0);
                                float f21 = k.f19387l;
                                z12 = false;
                                i21 = f21 >= 0.0f ? Math.round(f21 * lineBottom) + k.f19370B : (Math.round((f21 + 1.0f) * lineBottom) + k.f19372D) - height2;
                            }
                            int i52 = i21 + height2;
                            int i53 = k.f19372D;
                            if (i52 > i53) {
                                i21 = i53 - height2;
                            } else {
                                int i54 = k.f19370B;
                                if (i21 < i54) {
                                    i21 = i54;
                                }
                            }
                        } else {
                            z11 = false;
                            z12 = false;
                            i21 = (k.f19372D - height2) - ((int) (i38 * k.f19401z));
                        }
                        TextPaint textPaint3 = textPaint;
                        k.f19373E = new StaticLayout(spannableStringBuilder, textPaint3, i50, alignment3, k.f19382d, k.f19383e, true);
                        k.f19374F = new StaticLayout(spannableStringBuilder2, textPaint3, i50, alignment3, k.f19382d, k.f19383e, true);
                        k.f19375G = i19;
                        k.f19376H = i21;
                        k.f19377I = i39;
                    }
                }
                z11 = false;
                z12 = false;
            } else {
                i16 = i33;
                z10 = z8;
                i13 = i34;
                i15 = i36;
                i12 = i35;
                f4 = a02;
                z11 = false;
                z12 = false;
                k.k.getClass();
                Bitmap bitmap2 = k.k;
                int i55 = k.f19371C;
                int i56 = k.f19369A;
                int i57 = k.f19372D;
                int i58 = k.f19370B;
                float f22 = i55 - i56;
                float f23 = (k.f19390o * f22) + i56;
                float f24 = i57 - i58;
                float f25 = (k.f19387l * f24) + i58;
                int round2 = Math.round(f22 * k.f19392q);
                float f26 = k.f19393r;
                int round3 = f26 != -3.4028235E38f ? Math.round(f24 * f26) : Math.round((bitmap2.getHeight() / bitmap2.getWidth()) * round2);
                int i59 = k.f19391p;
                if (i59 == 2) {
                    f10 = round2;
                } else {
                    if (i59 == 1) {
                        f10 = round2 / 2;
                    }
                    int round4 = Math.round(f23);
                    i17 = k.f19389n;
                    if (i17 != 2) {
                        f11 = round3;
                    } else {
                        if (i17 == 1) {
                            f11 = round3 / 2;
                        }
                        int round5 = Math.round(f25);
                        k.f19378J = new Rect(round4, round5, round2 + round4, round3 + round5);
                    }
                    f25 -= f11;
                    int round52 = Math.round(f25);
                    k.f19378J = new Rect(round4, round52, round2 + round4, round3 + round52);
                }
                f23 -= f10;
                int round42 = Math.round(f23);
                i17 = k.f19389n;
                if (i17 != 2) {
                }
                f25 -= f11;
                int round522 = Math.round(f25);
                k.f19378J = new Rect(round42, round522, round2 + round42, round3 + round522);
            }
            canvas2 = canvas;
            k.a(canvas2, z10);
            i23 = i11 + 1;
            canvas3 = canvas2;
            list = list2;
            height = i26;
            i22 = i27;
            size = i7;
            a02 = f4;
            paddingBottom = i15;
            width = i12;
            paddingTop = i13;
            paddingLeft = i16;
            c1488b = this;
        }
    }
}
