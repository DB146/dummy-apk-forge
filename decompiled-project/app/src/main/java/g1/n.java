package g1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import c1.AbstractC0883a;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.utils.blurry.BlurFactor;
import f1.AbstractC1128a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f17416d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f17417e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f17418f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f17419a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17420b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f17421c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f17417e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f17418f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(C1181a c1181a, String str) {
        int i7;
        String[] split = str.split(",");
        Context context = c1181a.getContext();
        int[] iArr = new int[split.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < split.length) {
            String trim = split[i10].trim();
            Object obj = null;
            try {
                i7 = p.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i7 = 0;
            }
            if (i7 == 0) {
                i7 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i7 == 0 && c1181a.isInEditMode() && (c1181a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c1181a.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f13219A;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f13219A.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i7 = ((Integer) obj).intValue();
                }
            }
            iArr[i11] = i7;
            i10++;
            i11++;
        }
        return i11 != split.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0088. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:128:0x0600. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r3v120, types: [java.lang.Object, g1.h] */
    public static i d(Context context, AttributeSet attributeSet, boolean z8) {
        int i7;
        String str;
        String str2;
        String str3;
        int i10;
        String str4;
        int i11;
        i iVar = new i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z8 ? q.f17424c : q.f17422a);
        int[] iArr = f17416d;
        SparseIntArray sparseIntArray = f17417e;
        l lVar = iVar.f17324b;
        String[] strArr = AbstractC0883a.f14128a;
        m mVar = iVar.f17327e;
        k kVar = iVar.f17325c;
        j jVar = iVar.f17326d;
        String str5 = "Unknown attribute 0x";
        String str6 = "ConstraintSet";
        if (z8) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            ?? obj = new Object();
            obj.f17314a = new int[10];
            obj.f17315b = new int[10];
            obj.f17316c = 0;
            obj.f17317d = new int[10];
            obj.f17318e = new float[10];
            obj.f17319f = 0;
            obj.g = new int[5];
            obj.f17320h = new String[5];
            obj.f17321i = 0;
            obj.j = new int[4];
            obj.k = new boolean[4];
            obj.f17322l = 0;
            kVar.getClass();
            jVar.getClass();
            mVar.getClass();
            int i12 = 0;
            while (i12 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i12);
                int i13 = indexCount;
                switch (f17418f.get(index)) {
                    case 2:
                        str4 = str5;
                        obj.b(2, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f17338I));
                        i11 = 1;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case BlurFactor.DEFAULT_RADIUS /* 25 */:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb2 = new StringBuilder(str5);
                        str4 = str5;
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb2.toString());
                        i11 = 1;
                        break;
                    case 5:
                        str4 = str5;
                        obj.c(5, obtainStyledAttributes.getString(index));
                        i11 = 1;
                        break;
                    case 6:
                        str4 = str5;
                        obj.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f17332C));
                        i11 = 1;
                        break;
                    case 7:
                        str4 = str5;
                        obj.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f17333D));
                        i11 = 1;
                        break;
                    case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                        str4 = str5;
                        obj.b(8, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f17339J));
                        i11 = 1;
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 11 */:
                        str4 = str5;
                        obj.b(11, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f17344P));
                        i11 = 1;
                        break;
                    case 12:
                        str4 = str5;
                        obj.b(12, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f17345Q));
                        i11 = 1;
                        break;
                    case 13:
                        str4 = str5;
                        obj.b(13, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f17341M));
                        i11 = 1;
                        break;
                    case 14:
                        str4 = str5;
                        obj.b(14, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f17343O));
                        i11 = 1;
                        break;
                    case 15:
                        str4 = str5;
                        obj.b(15, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f17346R));
                        i11 = 1;
                        break;
                    case 16:
                        str4 = str5;
                        obj.b(16, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f17342N));
                        i11 = 1;
                        break;
                    case 17:
                        str4 = str5;
                        obj.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f17361d));
                        i11 = 1;
                        break;
                    case 18:
                        str4 = str5;
                        obj.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f17363e));
                        i11 = 1;
                        break;
                    case 19:
                        str4 = str5;
                        obj.a(19, obtainStyledAttributes.getFloat(index, jVar.f17365f));
                        i11 = 1;
                        break;
                    case 20:
                        str4 = str5;
                        obj.a(20, obtainStyledAttributes.getFloat(index, jVar.f17389w));
                        i11 = 1;
                        break;
                    case 21:
                        str4 = str5;
                        obj.b(21, obtainStyledAttributes.getLayoutDimension(index, jVar.f17359c));
                        i11 = 1;
                        break;
                    case 22:
                        str4 = str5;
                        obj.b(22, iArr[obtainStyledAttributes.getInt(index, lVar.f17401a)]);
                        i11 = 1;
                        break;
                    case 23:
                        str4 = str5;
                        obj.b(23, obtainStyledAttributes.getLayoutDimension(index, jVar.f17357b));
                        i11 = 1;
                        break;
                    case 24:
                        str4 = str5;
                        obj.b(24, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f17335F));
                        i11 = 1;
                        break;
                    case 27:
                        str4 = str5;
                        obj.b(27, obtainStyledAttributes.getInt(index, jVar.f17334E));
                        i11 = 1;
                        break;
                    case 28:
                        str4 = str5;
                        obj.b(28, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f17336G));
                        i11 = 1;
                        break;
                    case 31:
                        str4 = str5;
                        obj.b(31, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f17340K));
                        i11 = 1;
                        break;
                    case 34:
                        str4 = str5;
                        obj.b(34, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f17337H));
                        i11 = 1;
                        break;
                    case 37:
                        str4 = str5;
                        obj.a(37, obtainStyledAttributes.getFloat(index, jVar.f17390x));
                        i11 = 1;
                        break;
                    case 38:
                        str4 = str5;
                        int resourceId = obtainStyledAttributes.getResourceId(index, iVar.f17323a);
                        iVar.f17323a = resourceId;
                        obj.b(38, resourceId);
                        i11 = 1;
                        break;
                    case 39:
                        str4 = str5;
                        obj.a(39, obtainStyledAttributes.getFloat(index, jVar.f17349U));
                        i11 = 1;
                        break;
                    case 40:
                        str4 = str5;
                        obj.a(40, obtainStyledAttributes.getFloat(index, jVar.f17348T));
                        i11 = 1;
                        break;
                    case 41:
                        str4 = str5;
                        obj.b(41, obtainStyledAttributes.getInt(index, jVar.f17350V));
                        i11 = 1;
                        break;
                    case 42:
                        str4 = str5;
                        obj.b(42, obtainStyledAttributes.getInt(index, jVar.f17351W));
                        i11 = 1;
                        break;
                    case 43:
                        str4 = str5;
                        obj.a(43, obtainStyledAttributes.getFloat(index, lVar.f17403c));
                        i11 = 1;
                        break;
                    case 44:
                        str4 = str5;
                        obj.d(44, true);
                        obj.a(44, obtainStyledAttributes.getDimension(index, mVar.f17415m));
                        i11 = 1;
                        break;
                    case 45:
                        str4 = str5;
                        obj.a(45, obtainStyledAttributes.getFloat(index, mVar.f17407b));
                        i11 = 1;
                        break;
                    case 46:
                        str4 = str5;
                        obj.a(46, obtainStyledAttributes.getFloat(index, mVar.f17408c));
                        i11 = 1;
                        break;
                    case 47:
                        str4 = str5;
                        obj.a(47, obtainStyledAttributes.getFloat(index, mVar.f17409d));
                        i11 = 1;
                        break;
                    case 48:
                        str4 = str5;
                        obj.a(48, obtainStyledAttributes.getFloat(index, mVar.f17410e));
                        i11 = 1;
                        break;
                    case 49:
                        str4 = str5;
                        obj.a(49, obtainStyledAttributes.getDimension(index, mVar.f17411f));
                        i11 = 1;
                        break;
                    case 50:
                        str4 = str5;
                        obj.a(50, obtainStyledAttributes.getDimension(index, mVar.g));
                        i11 = 1;
                        break;
                    case 51:
                        str4 = str5;
                        obj.a(51, obtainStyledAttributes.getDimension(index, mVar.f17413i));
                        i11 = 1;
                        break;
                    case 52:
                        str4 = str5;
                        obj.a(52, obtainStyledAttributes.getDimension(index, mVar.j));
                        i11 = 1;
                        break;
                    case 53:
                        str4 = str5;
                        obj.a(53, obtainStyledAttributes.getDimension(index, mVar.k));
                        i11 = 1;
                        break;
                    case 54:
                        str4 = str5;
                        obj.b(54, obtainStyledAttributes.getInt(index, jVar.f17352X));
                        i11 = 1;
                        break;
                    case 55:
                        str4 = str5;
                        obj.b(55, obtainStyledAttributes.getInt(index, jVar.f17353Y));
                        i11 = 1;
                        break;
                    case 56:
                        str4 = str5;
                        obj.b(56, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f17354Z));
                        i11 = 1;
                        break;
                    case 57:
                        str4 = str5;
                        obj.b(57, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f17356a0));
                        i11 = 1;
                        break;
                    case 58:
                        str4 = str5;
                        obj.b(58, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f17358b0));
                        i11 = 1;
                        break;
                    case 59:
                        str4 = str5;
                        obj.b(59, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f17360c0));
                        i11 = 1;
                        break;
                    case 60:
                        str4 = str5;
                        obj.a(60, obtainStyledAttributes.getFloat(index, mVar.f17406a));
                        i11 = 1;
                        break;
                    case 62:
                        str4 = str5;
                        obj.b(62, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f17330A));
                        i11 = 1;
                        break;
                    case 63:
                        str4 = str5;
                        obj.a(63, obtainStyledAttributes.getFloat(index, jVar.f17331B));
                        i11 = 1;
                        break;
                    case 64:
                        str4 = str5;
                        obj.b(64, f(obtainStyledAttributes, index, kVar.f17393a));
                        i11 = 1;
                        break;
                    case 65:
                        str4 = str5;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obj.c(65, obtainStyledAttributes.getString(index));
                        } else {
                            obj.c(65, strArr[obtainStyledAttributes.getInteger(index, 0)]);
                        }
                        i11 = 1;
                        break;
                    case 66:
                        str4 = str5;
                        obj.b(66, obtainStyledAttributes.getInt(index, 0));
                        i11 = 1;
                        break;
                    case 67:
                        str4 = str5;
                        obj.a(67, obtainStyledAttributes.getFloat(index, kVar.f17397e));
                        i11 = 1;
                        break;
                    case 68:
                        str4 = str5;
                        obj.a(68, obtainStyledAttributes.getFloat(index, lVar.f17404d));
                        i11 = 1;
                        break;
                    case 69:
                        str4 = str5;
                        obj.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        i11 = 1;
                        break;
                    case 70:
                        str4 = str5;
                        obj.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        i11 = 1;
                        break;
                    case 71:
                        str4 = str5;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        i11 = 1;
                        break;
                    case 72:
                        str4 = str5;
                        obj.b(72, obtainStyledAttributes.getInt(index, jVar.f17366f0));
                        i11 = 1;
                        break;
                    case 73:
                        str4 = str5;
                        obj.b(73, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f17367g0));
                        i11 = 1;
                        break;
                    case 74:
                        str4 = str5;
                        obj.c(74, obtainStyledAttributes.getString(index));
                        i11 = 1;
                        break;
                    case 75:
                        str4 = str5;
                        obj.d(75, obtainStyledAttributes.getBoolean(index, jVar.f17379n0));
                        i11 = 1;
                        break;
                    case 76:
                        str4 = str5;
                        obj.b(76, obtainStyledAttributes.getInt(index, kVar.f17395c));
                        i11 = 1;
                        break;
                    case 77:
                        str4 = str5;
                        obj.c(77, obtainStyledAttributes.getString(index));
                        i11 = 1;
                        break;
                    case 78:
                        str4 = str5;
                        obj.b(78, obtainStyledAttributes.getInt(index, lVar.f17402b));
                        i11 = 1;
                        break;
                    case 79:
                        str4 = str5;
                        obj.a(79, obtainStyledAttributes.getFloat(index, kVar.f17396d));
                        i11 = 1;
                        break;
                    case 80:
                        str4 = str5;
                        obj.d(80, obtainStyledAttributes.getBoolean(index, jVar.f17375l0));
                        i11 = 1;
                        break;
                    case 81:
                        str4 = str5;
                        obj.d(81, obtainStyledAttributes.getBoolean(index, jVar.f17377m0));
                        i11 = 1;
                        break;
                    case 82:
                        str4 = str5;
                        obj.b(82, obtainStyledAttributes.getInteger(index, kVar.f17394b));
                        i11 = 1;
                        break;
                    case 83:
                        str4 = str5;
                        obj.b(83, f(obtainStyledAttributes, index, mVar.f17412h));
                        i11 = 1;
                        break;
                    case 84:
                        str4 = str5;
                        obj.b(84, obtainStyledAttributes.getInteger(index, kVar.g));
                        i11 = 1;
                        break;
                    case 85:
                        str4 = str5;
                        obj.a(85, obtainStyledAttributes.getFloat(index, kVar.f17398f));
                        i11 = 1;
                        break;
                    case 86:
                        str4 = str5;
                        int i14 = obtainStyledAttributes.peekValue(index).type;
                        if (i14 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            kVar.f17400i = resourceId2;
                            obj.b(89, resourceId2);
                            if (kVar.f17400i != -1) {
                                obj.b(88, -2);
                            }
                        } else if (i14 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            kVar.f17399h = string;
                            obj.c(90, string);
                            if (kVar.f17399h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                kVar.f17400i = resourceId3;
                                obj.b(89, resourceId3);
                                obj.b(88, -2);
                            } else {
                                obj.b(88, -1);
                            }
                        } else {
                            obj.b(88, obtainStyledAttributes.getInteger(index, kVar.f17400i));
                        }
                        i11 = 1;
                        break;
                    case 87:
                        str4 = str5;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        i11 = 1;
                        break;
                    case 93:
                        str4 = str5;
                        obj.b(93, obtainStyledAttributes.getDimensionPixelSize(index, jVar.L));
                        i11 = 1;
                        break;
                    case 94:
                        str4 = str5;
                        obj.b(94, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f17347S));
                        i11 = 1;
                        break;
                    case 95:
                        str4 = str5;
                        g(obj, obtainStyledAttributes, index, 0);
                        i11 = 1;
                        break;
                    case 96:
                        str4 = str5;
                        i11 = 1;
                        g(obj, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        str4 = str5;
                        obj.b(97, obtainStyledAttributes.getInt(index, jVar.f17381o0));
                        i11 = 1;
                        break;
                    case 98:
                        str4 = str5;
                        int i15 = AbstractC1128a.f16934E;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                        } else {
                            iVar.f17323a = obtainStyledAttributes.getResourceId(index, iVar.f17323a);
                        }
                        i11 = 1;
                        break;
                    case 99:
                        str4 = str5;
                        obj.d(99, obtainStyledAttributes.getBoolean(index, jVar.g));
                        i11 = 1;
                        break;
                }
                i12 += i11;
                indexCount = i13;
                str5 = str4;
            }
        } else {
            String str7 = "CURRENTLY UNSUPPORTED";
            String str8 = "Unknown attribute 0x";
            int i16 = 1;
            int indexCount2 = obtainStyledAttributes.getIndexCount();
            int i17 = 0;
            while (i17 < indexCount2) {
                int index2 = obtainStyledAttributes.getIndex(i17);
                if (index2 != i16 && 23 != index2 && 24 != index2) {
                    kVar.getClass();
                    jVar.getClass();
                    mVar.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17382p = f(obtainStyledAttributes, index2, jVar.f17382p);
                        i10 = 1;
                        break;
                    case 2:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17338I = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f17338I);
                        i10 = 1;
                        break;
                    case 3:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17380o = f(obtainStyledAttributes, index2, jVar.f17380o);
                        i10 = 1;
                        break;
                    case 4:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17378n = f(obtainStyledAttributes, index2, jVar.f17378n);
                        i10 = 1;
                        break;
                    case 5:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17391y = obtainStyledAttributes.getString(index2);
                        i10 = 1;
                        break;
                    case 6:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17332C = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f17332C);
                        i10 = 1;
                        break;
                    case 7:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17333D = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f17333D);
                        i10 = 1;
                        break;
                    case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17339J = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f17339J);
                        i10 = 1;
                        break;
                    case 9:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17388v = f(obtainStyledAttributes, index2, jVar.f17388v);
                        i10 = 1;
                        break;
                    case 10:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17387u = f(obtainStyledAttributes, index2, jVar.f17387u);
                        i10 = 1;
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 11 */:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17344P = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f17344P);
                        i10 = 1;
                        break;
                    case 12:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17345Q = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f17345Q);
                        i10 = 1;
                        break;
                    case 13:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17341M = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f17341M);
                        i10 = 1;
                        break;
                    case 14:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17343O = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f17343O);
                        i10 = 1;
                        break;
                    case 15:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17346R = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f17346R);
                        i10 = 1;
                        break;
                    case 16:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17342N = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f17342N);
                        i10 = 1;
                        break;
                    case 17:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17361d = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f17361d);
                        i10 = 1;
                        break;
                    case 18:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17363e = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f17363e);
                        i10 = 1;
                        break;
                    case 19:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17365f = obtainStyledAttributes.getFloat(index2, jVar.f17365f);
                        i10 = 1;
                        break;
                    case 20:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17389w = obtainStyledAttributes.getFloat(index2, jVar.f17389w);
                        i10 = 1;
                        break;
                    case 21:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17359c = obtainStyledAttributes.getLayoutDimension(index2, jVar.f17359c);
                        i10 = 1;
                        break;
                    case 22:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        int i18 = obtainStyledAttributes.getInt(index2, lVar.f17401a);
                        lVar.f17401a = i18;
                        lVar.f17401a = iArr[i18];
                        i10 = 1;
                        break;
                    case 23:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17357b = obtainStyledAttributes.getLayoutDimension(index2, jVar.f17357b);
                        i10 = 1;
                        break;
                    case 24:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17335F = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f17335F);
                        i10 = 1;
                        break;
                    case BlurFactor.DEFAULT_RADIUS /* 25 */:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17368h = f(obtainStyledAttributes, index2, jVar.f17368h);
                        i10 = 1;
                        break;
                    case 26:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17370i = f(obtainStyledAttributes, index2, jVar.f17370i);
                        i10 = 1;
                        break;
                    case 27:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17334E = obtainStyledAttributes.getInt(index2, jVar.f17334E);
                        i10 = 1;
                        break;
                    case 28:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17336G = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f17336G);
                        i10 = 1;
                        break;
                    case 29:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.j = f(obtainStyledAttributes, index2, jVar.j);
                        i10 = 1;
                        break;
                    case 30:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.k = f(obtainStyledAttributes, index2, jVar.k);
                        i10 = 1;
                        break;
                    case 31:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17340K = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f17340K);
                        i10 = 1;
                        break;
                    case 32:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17385s = f(obtainStyledAttributes, index2, jVar.f17385s);
                        i10 = 1;
                        break;
                    case 33:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17386t = f(obtainStyledAttributes, index2, jVar.f17386t);
                        i10 = 1;
                        break;
                    case 34:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17337H = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f17337H);
                        i10 = 1;
                        break;
                    case 35:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17376m = f(obtainStyledAttributes, index2, jVar.f17376m);
                        i10 = 1;
                        break;
                    case 36:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17374l = f(obtainStyledAttributes, index2, jVar.f17374l);
                        i10 = 1;
                        break;
                    case 37:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17390x = obtainStyledAttributes.getFloat(index2, jVar.f17390x);
                        i10 = 1;
                        break;
                    case 38:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        iVar.f17323a = obtainStyledAttributes.getResourceId(index2, iVar.f17323a);
                        i10 = 1;
                        break;
                    case 39:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17349U = obtainStyledAttributes.getFloat(index2, jVar.f17349U);
                        i10 = 1;
                        break;
                    case 40:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17348T = obtainStyledAttributes.getFloat(index2, jVar.f17348T);
                        i10 = 1;
                        break;
                    case 41:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17350V = obtainStyledAttributes.getInt(index2, jVar.f17350V);
                        i10 = 1;
                        break;
                    case 42:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17351W = obtainStyledAttributes.getInt(index2, jVar.f17351W);
                        i10 = 1;
                        break;
                    case 43:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        lVar.f17403c = obtainStyledAttributes.getFloat(index2, lVar.f17403c);
                        i10 = 1;
                        break;
                    case 44:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f17414l = true;
                        mVar.f17415m = obtainStyledAttributes.getDimension(index2, mVar.f17415m);
                        i10 = 1;
                        break;
                    case 45:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f17407b = obtainStyledAttributes.getFloat(index2, mVar.f17407b);
                        i10 = 1;
                        break;
                    case 46:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f17408c = obtainStyledAttributes.getFloat(index2, mVar.f17408c);
                        i10 = 1;
                        break;
                    case 47:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f17409d = obtainStyledAttributes.getFloat(index2, mVar.f17409d);
                        i10 = 1;
                        break;
                    case 48:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f17410e = obtainStyledAttributes.getFloat(index2, mVar.f17410e);
                        i10 = 1;
                        break;
                    case 49:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f17411f = obtainStyledAttributes.getDimension(index2, mVar.f17411f);
                        i10 = 1;
                        break;
                    case 50:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.g = obtainStyledAttributes.getDimension(index2, mVar.g);
                        i10 = 1;
                        break;
                    case 51:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f17413i = obtainStyledAttributes.getDimension(index2, mVar.f17413i);
                        i10 = 1;
                        break;
                    case 52:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.j = obtainStyledAttributes.getDimension(index2, mVar.j);
                        i10 = 1;
                        break;
                    case 53:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.k = obtainStyledAttributes.getDimension(index2, mVar.k);
                        i10 = 1;
                        break;
                    case 54:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17352X = obtainStyledAttributes.getInt(index2, jVar.f17352X);
                        i10 = 1;
                        break;
                    case 55:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17353Y = obtainStyledAttributes.getInt(index2, jVar.f17353Y);
                        i10 = 1;
                        break;
                    case 56:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17354Z = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f17354Z);
                        i10 = 1;
                        break;
                    case 57:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17356a0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f17356a0);
                        i10 = 1;
                        break;
                    case 58:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17358b0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f17358b0);
                        i10 = 1;
                        break;
                    case 59:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17360c0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f17360c0);
                        i10 = 1;
                        break;
                    case 60:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f17406a = obtainStyledAttributes.getFloat(index2, mVar.f17406a);
                        i10 = 1;
                        break;
                    case 61:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17392z = f(obtainStyledAttributes, index2, jVar.f17392z);
                        i10 = 1;
                        break;
                    case 62:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17330A = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f17330A);
                        i10 = 1;
                        break;
                    case 63:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f17331B = obtainStyledAttributes.getFloat(index2, jVar.f17331B);
                        i10 = 1;
                        break;
                    case 64:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f17393a = f(obtainStyledAttributes, index2, kVar.f17393a);
                        i10 = 1;
                        break;
                    case 65:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        if (obtainStyledAttributes.peekValue(index2).type != 3) {
                            String str9 = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            kVar.getClass();
                            i10 = 1;
                            break;
                        } else {
                            obtainStyledAttributes.getString(index2);
                            kVar.getClass();
                            i10 = 1;
                            break;
                        }
                    case 66:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        obtainStyledAttributes.getInt(index2, 0);
                        kVar.getClass();
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 67:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        kVar.f17397e = obtainStyledAttributes.getFloat(index2, kVar.f17397e);
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 68:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        lVar.f17404d = obtainStyledAttributes.getFloat(index2, lVar.f17404d);
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 69:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        jVar.f17362d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 70:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        jVar.f17364e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 71:
                        i7 = indexCount2;
                        str = str7;
                        str2 = str8;
                        Log.e(str6, str);
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 72:
                        i7 = indexCount2;
                        str2 = str8;
                        jVar.f17366f0 = obtainStyledAttributes.getInt(index2, jVar.f17366f0);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 73:
                        i7 = indexCount2;
                        str2 = str8;
                        jVar.f17367g0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f17367g0);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 74:
                        i7 = indexCount2;
                        str2 = str8;
                        jVar.f17372j0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 75:
                        i7 = indexCount2;
                        str2 = str8;
                        jVar.f17379n0 = obtainStyledAttributes.getBoolean(index2, jVar.f17379n0);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 76:
                        i7 = indexCount2;
                        str2 = str8;
                        kVar.f17395c = obtainStyledAttributes.getInt(index2, kVar.f17395c);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 77:
                        i7 = indexCount2;
                        str2 = str8;
                        jVar.f17373k0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 78:
                        i7 = indexCount2;
                        str2 = str8;
                        lVar.f17402b = obtainStyledAttributes.getInt(index2, lVar.f17402b);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 79:
                        i7 = indexCount2;
                        str2 = str8;
                        kVar.f17396d = obtainStyledAttributes.getFloat(index2, kVar.f17396d);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 80:
                        i7 = indexCount2;
                        str2 = str8;
                        jVar.f17375l0 = obtainStyledAttributes.getBoolean(index2, jVar.f17375l0);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 81:
                        i7 = indexCount2;
                        str2 = str8;
                        jVar.f17377m0 = obtainStyledAttributes.getBoolean(index2, jVar.f17377m0);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 82:
                        i7 = indexCount2;
                        str2 = str8;
                        kVar.f17394b = obtainStyledAttributes.getInteger(index2, kVar.f17394b);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 83:
                        i7 = indexCount2;
                        str2 = str8;
                        mVar.f17412h = f(obtainStyledAttributes, index2, mVar.f17412h);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 84:
                        i7 = indexCount2;
                        str2 = str8;
                        kVar.g = obtainStyledAttributes.getInteger(index2, kVar.g);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 85:
                        i7 = indexCount2;
                        str2 = str8;
                        kVar.f17398f = obtainStyledAttributes.getFloat(index2, kVar.f17398f);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 86:
                        i7 = indexCount2;
                        str2 = str8;
                        int i19 = obtainStyledAttributes.peekValue(index2).type;
                        if (i19 == 1) {
                            kVar.f17400i = obtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i19 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            kVar.f17399h = string2;
                            if (string2.indexOf("/") > 0) {
                                kVar.f17400i = obtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, kVar.f17400i);
                        }
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 87:
                        i7 = indexCount2;
                        str2 = str8;
                        Log.w(str6, "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        str2 = str8;
                        StringBuilder sb3 = new StringBuilder(str2);
                        i7 = indexCount2;
                        sb3.append(Integer.toHexString(index2));
                        sb3.append("   ");
                        sb3.append(sparseIntArray.get(index2));
                        Log.w(str6, sb3.toString());
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 91:
                        i7 = indexCount2;
                        str2 = str8;
                        jVar.f17383q = f(obtainStyledAttributes, index2, jVar.f17383q);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 92:
                        i7 = indexCount2;
                        str2 = str8;
                        jVar.f17384r = f(obtainStyledAttributes, index2, jVar.f17384r);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 93:
                        i7 = indexCount2;
                        str2 = str8;
                        jVar.L = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.L);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 94:
                        i7 = indexCount2;
                        str2 = str8;
                        jVar.f17347S = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f17347S);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 95:
                        i7 = indexCount2;
                        str2 = str8;
                        g(jVar, obtainStyledAttributes, index2, 0);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 96:
                        i7 = indexCount2;
                        str2 = str8;
                        g(jVar, obtainStyledAttributes, index2, 1);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 97:
                        i7 = indexCount2;
                        str2 = str8;
                        jVar.f17381o0 = obtainStyledAttributes.getInt(index2, jVar.f17381o0);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                }
                i17 += i10;
                indexCount2 = i7;
                str8 = str2;
                String str10 = str;
                i16 = i10;
                str6 = str3;
                str7 = str10;
            }
            if (jVar.f17372j0 != null) {
                jVar.f17371i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return iVar;
    }

    public static int f(TypedArray typedArray, int i7, int i10) {
        int resourceId = typedArray.getResourceId(i7, i10);
        return resourceId == -1 ? typedArray.getInt(i7, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(Object obj, TypedArray typedArray, int i7, int i10) {
        int dimensionPixelSize;
        if (obj == null) {
            return;
        }
        int i11 = typedArray.peekValue(i7).type;
        boolean z8 = true;
        int i12 = 0;
        if (i11 == 3) {
            String string = typedArray.getString(i7);
            if (string == null) {
                return;
            }
            int indexOf = string.indexOf(61);
            int length = string.length();
            if (indexOf <= 0 || indexOf >= length - 1) {
                return;
            }
            String substring = string.substring(0, indexOf);
            String substring2 = string.substring(indexOf + 1);
            if (substring2.length() > 0) {
                String trim = substring.trim();
                String trim2 = substring2.trim();
                if ("ratio".equalsIgnoreCase(trim)) {
                    if (obj instanceof e) {
                        e eVar = (e) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) eVar).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) eVar).height = 0;
                        }
                        h(eVar, trim2);
                        return;
                    }
                    if (obj instanceof j) {
                        ((j) obj).f17391y = trim2;
                        return;
                    } else {
                        if (obj instanceof h) {
                            ((h) obj).c(5, trim2);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof e) {
                            e eVar2 = (e) obj;
                            if (i10 == 0) {
                                ((ViewGroup.MarginLayoutParams) eVar2).width = 0;
                                eVar2.f17245H = parseFloat;
                            } else {
                                ((ViewGroup.MarginLayoutParams) eVar2).height = 0;
                                eVar2.f17246I = parseFloat;
                            }
                        } else if (obj instanceof j) {
                            j jVar = (j) obj;
                            if (i10 == 0) {
                                jVar.f17357b = 0;
                                jVar.f17349U = parseFloat;
                            } else {
                                jVar.f17359c = 0;
                                jVar.f17348T = parseFloat;
                            }
                        } else if (obj instanceof h) {
                            h hVar = (h) obj;
                            if (i10 == 0) {
                                hVar.b(23, 0);
                                hVar.a(39, parseFloat);
                            } else {
                                hVar.b(21, 0);
                                hVar.a(40, parseFloat);
                            }
                        }
                    } else {
                        if (!"parent".equalsIgnoreCase(trim)) {
                            return;
                        }
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof e) {
                            e eVar3 = (e) obj;
                            if (i10 == 0) {
                                ((ViewGroup.MarginLayoutParams) eVar3).width = 0;
                                eVar3.f17254R = max;
                                eVar3.L = 2;
                            } else {
                                ((ViewGroup.MarginLayoutParams) eVar3).height = 0;
                                eVar3.f17255S = max;
                                eVar3.f17249M = 2;
                            }
                        } else if (obj instanceof j) {
                            j jVar2 = (j) obj;
                            if (i10 == 0) {
                                jVar2.f17357b = 0;
                                jVar2.f17362d0 = max;
                                jVar2.f17352X = 2;
                            } else {
                                jVar2.f17359c = 0;
                                jVar2.f17364e0 = max;
                                jVar2.f17353Y = 2;
                            }
                        } else if (obj instanceof h) {
                            h hVar2 = (h) obj;
                            if (i10 == 0) {
                                hVar2.b(23, 0);
                                hVar2.b(54, 2);
                            } else {
                                hVar2.b(21, 0);
                                hVar2.b(55, 2);
                            }
                        }
                    }
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            }
            return;
        }
        if (i11 != 5) {
            dimensionPixelSize = typedArray.getInt(i7, 0);
            if (dimensionPixelSize == -4) {
                i12 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z8 = false;
            }
            if (!(obj instanceof e)) {
                e eVar4 = (e) obj;
                if (i10 == 0) {
                    ((ViewGroup.MarginLayoutParams) eVar4).width = i12;
                    eVar4.f17259W = z8;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) eVar4).height = i12;
                    eVar4.f17260X = z8;
                    return;
                }
            }
            if (obj instanceof j) {
                j jVar3 = (j) obj;
                if (i10 == 0) {
                    jVar3.f17357b = i12;
                    jVar3.f17375l0 = z8;
                    return;
                } else {
                    jVar3.f17359c = i12;
                    jVar3.f17377m0 = z8;
                    return;
                }
            }
            if (obj instanceof h) {
                h hVar3 = (h) obj;
                if (i10 == 0) {
                    hVar3.b(23, i12);
                    hVar3.d(80, z8);
                    return;
                } else {
                    hVar3.b(21, i12);
                    hVar3.d(81, z8);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i7, 0);
        z8 = false;
        i12 = dimensionPixelSize;
        if (!(obj instanceof e)) {
        }
    }

    public static void h(e eVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            char c10 = 65535;
            int i7 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    c10 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    c10 = 1;
                }
                i7 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(i7);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(i7, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (c10 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        eVar.f17244G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:43:0x0100. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [g1.c, g1.a, android.view.View] */
    /* JADX WARN: Type inference failed for: r8v1, types: [d1.i, d1.a] */
    public final void a(ConstraintLayout constraintLayout) {
        int i7;
        HashMap hashMap;
        String str;
        int i10;
        String str2;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = nVar.f17421c;
        HashSet hashSet = new HashSet(hashMap2.keySet());
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = constraintLayout.getChildAt(i11);
            int id = childAt.getId();
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb2 = new StringBuilder("id unknown ");
                try {
                    str2 = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str2 = "UNKNOWN";
                }
                sb2.append(str2);
                Log.w("ConstraintSet", sb2.toString());
            } else {
                if (nVar.f17420b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        i iVar = (i) hashMap2.get(Integer.valueOf(id));
                        if (iVar != null) {
                            if (childAt instanceof C1181a) {
                                j jVar = iVar.f17326d;
                                jVar.f17369h0 = 1;
                                C1181a c1181a = (C1181a) childAt;
                                c1181a.setId(id);
                                c1181a.setType(jVar.f17366f0);
                                c1181a.setMargin(jVar.f17367g0);
                                c1181a.setAllowsGoneWidget(jVar.f17379n0);
                                int[] iArr = jVar.f17371i0;
                                if (iArr != null) {
                                    c1181a.setReferencedIds(iArr);
                                } else {
                                    String str3 = jVar.f17372j0;
                                    if (str3 != null) {
                                        int[] c10 = c(c1181a, str3);
                                        jVar.f17371i0 = c10;
                                        c1181a.setReferencedIds(c10);
                                    }
                                }
                            }
                            e eVar = (e) childAt.getLayoutParams();
                            eVar.a();
                            iVar.a(eVar);
                            HashMap hashMap3 = iVar.f17328f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                b bVar = (b) hashMap3.get(str4);
                                if (bVar.f17224a) {
                                    hashMap = hashMap3;
                                    str = str4;
                                } else {
                                    str = X.c.t("set", str4);
                                    hashMap = hashMap3;
                                }
                                try {
                                    switch (P.c.b(bVar.f17225b)) {
                                        case 0:
                                            i10 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(bVar.f17226c));
                                            break;
                                        case 1:
                                            i10 = childCount;
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(bVar.f17227d));
                                            break;
                                        case 2:
                                            i10 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(bVar.g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            i10 = childCount;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(bVar.g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e2) {
                                                e = e2;
                                                StringBuilder n6 = X.c.n(" Custom Attribute \"", str4, "\" not found on ");
                                                n6.append(cls.getName());
                                                Log.e("TransitionLayout", n6.toString(), e);
                                                hashMap3 = hashMap;
                                                childCount = i10;
                                            } catch (NoSuchMethodException e10) {
                                                e = e10;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                                hashMap3 = hashMap;
                                                childCount = i10;
                                            } catch (InvocationTargetException e11) {
                                                e = e11;
                                                StringBuilder n8 = X.c.n(" Custom Attribute \"", str4, "\" not found on ");
                                                n8.append(cls.getName());
                                                Log.e("TransitionLayout", n8.toString(), e);
                                                hashMap3 = hashMap;
                                                childCount = i10;
                                            }
                                        case 4:
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, bVar.f17228e);
                                            i10 = childCount;
                                            break;
                                        case 5:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bVar.f17229f));
                                            i10 = childCount;
                                            break;
                                        case 6:
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(bVar.f17227d));
                                            i10 = childCount;
                                            break;
                                        case 7:
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(bVar.f17226c));
                                            i10 = childCount;
                                            break;
                                        default:
                                            i10 = childCount;
                                            break;
                                    }
                                } catch (IllegalAccessException e12) {
                                    e = e12;
                                    i10 = childCount;
                                } catch (NoSuchMethodException e13) {
                                    e = e13;
                                    i10 = childCount;
                                } catch (InvocationTargetException e14) {
                                    e = e14;
                                    i10 = childCount;
                                }
                                hashMap3 = hashMap;
                                childCount = i10;
                            }
                            i7 = childCount;
                            childAt.setLayoutParams(eVar);
                            l lVar = iVar.f17324b;
                            if (lVar.f17402b == 0) {
                                childAt.setVisibility(lVar.f17401a);
                            }
                            childAt.setAlpha(lVar.f17403c);
                            m mVar = iVar.f17327e;
                            childAt.setRotation(mVar.f17406a);
                            childAt.setRotationX(mVar.f17407b);
                            childAt.setRotationY(mVar.f17408c);
                            childAt.setScaleX(mVar.f17409d);
                            childAt.setScaleY(mVar.f17410e);
                            if (mVar.f17412h != -1) {
                                if (((View) childAt.getParent()).findViewById(mVar.f17412h) != null) {
                                    float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                    float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(mVar.f17411f)) {
                                    childAt.setPivotX(mVar.f17411f);
                                }
                                if (!Float.isNaN(mVar.g)) {
                                    childAt.setPivotY(mVar.g);
                                }
                            }
                            childAt.setTranslationX(mVar.f17413i);
                            childAt.setTranslationY(mVar.j);
                            childAt.setTranslationZ(mVar.k);
                            if (mVar.f17414l) {
                                childAt.setElevation(mVar.f17415m);
                            }
                        }
                    } else {
                        i7 = childCount;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i11++;
                    nVar = this;
                    childCount = i7;
                }
            }
            i7 = childCount;
            i11++;
            nVar = this;
            childCount = i7;
        }
        int i12 = childCount;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            i iVar2 = (i) hashMap2.get(num);
            if (iVar2 != null) {
                j jVar2 = iVar2.f17326d;
                if (jVar2.f17369h0 == 1) {
                    Context context = constraintLayout.getContext();
                    ?? view = new View(context);
                    view.f17230a = new int[32];
                    view.f17236u = new HashMap();
                    view.f17232c = context;
                    ?? iVar3 = new d1.i();
                    iVar3.f16314s0 = 0;
                    iVar3.f16315t0 = true;
                    iVar3.f16316u0 = 0;
                    iVar3.f16317v0 = false;
                    view.f17223x = iVar3;
                    view.f17233d = iVar3;
                    view.i();
                    view.setVisibility(8);
                    view.setId(num.intValue());
                    int[] iArr2 = jVar2.f17371i0;
                    if (iArr2 != null) {
                        view.setReferencedIds(iArr2);
                    } else {
                        String str5 = jVar2.f17372j0;
                        if (str5 != null) {
                            int[] c11 = c(view, str5);
                            jVar2.f17371i0 = c11;
                            view.setReferencedIds(c11);
                        }
                    }
                    view.setType(jVar2.f17366f0);
                    view.setMargin(jVar2.f17367g0);
                    e d10 = ConstraintLayout.d();
                    view.i();
                    iVar2.a(d10);
                    constraintLayout.addView((View) view, d10);
                }
                if (jVar2.f17355a) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    e d11 = ConstraintLayout.d();
                    iVar2.a(d11);
                    constraintLayout.addView(guideline, d11);
                }
            }
        }
        for (int i13 = 0; i13 < i12; i13++) {
            View childAt2 = constraintLayout.getChildAt(i13);
            if (childAt2 instanceof c) {
                ((c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i7;
        HashMap hashMap;
        HashMap hashMap2;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap3 = nVar.f17421c;
        hashMap3.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            e eVar = (e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (nVar.f17420b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap3.containsKey(Integer.valueOf(id))) {
                hashMap3.put(Integer.valueOf(id), new i());
            }
            i iVar = (i) hashMap3.get(Integer.valueOf(id));
            if (iVar == null) {
                i7 = childCount;
                hashMap = hashMap3;
            } else {
                HashMap hashMap4 = nVar.f17419a;
                HashMap hashMap5 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap4.keySet()) {
                    b bVar = (b) hashMap4.get(str);
                    int i11 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap2 = hashMap3;
                            try {
                                hashMap5.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e2) {
                                e = e2;
                                StringBuilder n6 = X.c.n(" Custom Attribute \"", str, "\" not found on ");
                                n6.append(cls.getName());
                                Log.e("TransitionLayout", n6.toString(), e);
                                childCount = i11;
                                hashMap3 = hashMap2;
                            } catch (NoSuchMethodException e10) {
                                e = e10;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                childCount = i11;
                                hashMap3 = hashMap2;
                            } catch (InvocationTargetException e11) {
                                e = e11;
                                StringBuilder n8 = X.c.n(" Custom Attribute \"", str, "\" not found on ");
                                n8.append(cls.getName());
                                Log.e("TransitionLayout", n8.toString(), e);
                                childCount = i11;
                                hashMap3 = hashMap2;
                            }
                        } else {
                            hashMap2 = hashMap3;
                            hashMap5.put(str, new b(bVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e12) {
                        e = e12;
                        hashMap2 = hashMap3;
                    } catch (NoSuchMethodException e13) {
                        e = e13;
                        hashMap2 = hashMap3;
                    } catch (InvocationTargetException e14) {
                        e = e14;
                        hashMap2 = hashMap3;
                    }
                    childCount = i11;
                    hashMap3 = hashMap2;
                }
                i7 = childCount;
                hashMap = hashMap3;
                iVar.f17328f = hashMap5;
                iVar.f17323a = id;
                int i12 = eVar.f17271e;
                j jVar = iVar.f17326d;
                jVar.f17368h = i12;
                jVar.f17370i = eVar.f17273f;
                jVar.j = eVar.g;
                jVar.k = eVar.f17276h;
                jVar.f17374l = eVar.f17278i;
                jVar.f17376m = eVar.j;
                jVar.f17378n = eVar.k;
                jVar.f17380o = eVar.f17282l;
                jVar.f17382p = eVar.f17284m;
                jVar.f17383q = eVar.f17286n;
                jVar.f17384r = eVar.f17288o;
                jVar.f17385s = eVar.f17294s;
                jVar.f17386t = eVar.f17295t;
                jVar.f17387u = eVar.f17296u;
                jVar.f17388v = eVar.f17297v;
                jVar.f17389w = eVar.f17242E;
                jVar.f17390x = eVar.f17243F;
                jVar.f17391y = eVar.f17244G;
                jVar.f17392z = eVar.f17290p;
                jVar.f17330A = eVar.f17292q;
                jVar.f17331B = eVar.f17293r;
                jVar.f17332C = eVar.f17256T;
                jVar.f17333D = eVar.f17257U;
                jVar.f17334E = eVar.f17258V;
                jVar.f17365f = eVar.f17267c;
                jVar.f17361d = eVar.f17263a;
                jVar.f17363e = eVar.f17265b;
                jVar.f17357b = ((ViewGroup.MarginLayoutParams) eVar).width;
                jVar.f17359c = ((ViewGroup.MarginLayoutParams) eVar).height;
                jVar.f17335F = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                jVar.f17336G = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                jVar.f17337H = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                jVar.f17338I = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                jVar.L = eVar.f17241D;
                jVar.f17348T = eVar.f17246I;
                jVar.f17349U = eVar.f17245H;
                jVar.f17351W = eVar.f17248K;
                jVar.f17350V = eVar.f17247J;
                jVar.f17375l0 = eVar.f17259W;
                jVar.f17377m0 = eVar.f17260X;
                jVar.f17352X = eVar.L;
                jVar.f17353Y = eVar.f17249M;
                jVar.f17354Z = eVar.f17252P;
                jVar.f17356a0 = eVar.f17253Q;
                jVar.f17358b0 = eVar.f17250N;
                jVar.f17360c0 = eVar.f17251O;
                jVar.f17362d0 = eVar.f17254R;
                jVar.f17364e0 = eVar.f17255S;
                jVar.f17373k0 = eVar.f17261Y;
                jVar.f17342N = eVar.f17299x;
                jVar.f17344P = eVar.f17301z;
                jVar.f17341M = eVar.f17298w;
                jVar.f17343O = eVar.f17300y;
                jVar.f17346R = eVar.f17238A;
                jVar.f17345Q = eVar.f17239B;
                jVar.f17347S = eVar.f17240C;
                jVar.f17381o0 = eVar.f17262Z;
                jVar.f17339J = eVar.getMarginEnd();
                jVar.f17340K = eVar.getMarginStart();
                int visibility = childAt.getVisibility();
                l lVar = iVar.f17324b;
                lVar.f17401a = visibility;
                lVar.f17403c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                m mVar = iVar.f17327e;
                mVar.f17406a = rotation;
                mVar.f17407b = childAt.getRotationX();
                mVar.f17408c = childAt.getRotationY();
                mVar.f17409d = childAt.getScaleX();
                mVar.f17410e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    mVar.f17411f = pivotX;
                    mVar.g = pivotY;
                }
                mVar.f17413i = childAt.getTranslationX();
                mVar.j = childAt.getTranslationY();
                mVar.k = childAt.getTranslationZ();
                if (mVar.f17414l) {
                    mVar.f17415m = childAt.getElevation();
                }
                if (childAt instanceof C1181a) {
                    C1181a c1181a = (C1181a) childAt;
                    jVar.f17379n0 = c1181a.getAllowsGoneWidget();
                    jVar.f17371i0 = c1181a.getReferencedIds();
                    jVar.f17366f0 = c1181a.getType();
                    jVar.f17367g0 = c1181a.getMargin();
                }
            }
            i10++;
            nVar = this;
            childCount = i7;
            hashMap3 = hashMap;
        }
    }

    public final void e(Context context, int i7) {
        XmlResourceParser xml = context.getResources().getXml(i7);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    i d10 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d10.f17326d.f17355a = true;
                    }
                    this.f17421c.put(Integer.valueOf(d10.f17323a), d10);
                }
            }
        } catch (IOException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i7, e2);
        } catch (XmlPullParserException e10) {
            Log.e("ConstraintSet", "Error parsing resource: " + i7, e10);
        }
    }
}
