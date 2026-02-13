package com.bumptech.glide;

import A0.G0;
import A3.o;
import B0.AbstractC0169c;
import G3.A;
import G3.C;
import G3.C0283e;
import G3.t;
import G3.z;
import H2.O;
import J3.C0337a;
import J3.C0338b;
import J3.C0339c;
import J3.C0342f;
import J3.C0343g;
import J3.G;
import J3.q;
import N6.F;
import N6.L;
import N6.z0;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.kt.apps.media.xemtv.beta.R;
import g3.C1191j;
import i2.C1332t;
import ib.C1360b;
import ib.C1361c;
import j0.D;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.zip.Inflater;
import l2.X;
import m9.C1649f;
import m9.EnumC1647d;
import n5.v;
import o9.C1825a;
import p5.C1854e;
import t8.C2034c;
import x3.C2262d;
import xb.AbstractC2275c;
import y1.InterfaceC2362j;
import y1.J;
import y1.K;
import y6.C2399e;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14607a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f14608b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f14609c = false;

    /* renamed from: d, reason: collision with root package name */
    public static Method f14610d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f14611e = false;

    /* renamed from: f, reason: collision with root package name */
    public static Field f14612f;

    public static void A(Parcel parcel, int i7, byte[] bArr, boolean z8) {
        if (bArr == null) {
            if (z8) {
                O(parcel, i7, 0);
            }
        } else {
            int M3 = M(i7, parcel);
            parcel.writeByteArray(bArr);
            N(M3, parcel);
        }
    }

    public static void B(Parcel parcel, int i7, Double d10) {
        if (d10 == null) {
            return;
        }
        O(parcel, i7, 8);
        parcel.writeDouble(d10.doubleValue());
    }

    public static void C(Parcel parcel, int i7, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int M3 = M(i7, parcel);
        parcel.writeStrongBinder(iBinder);
        N(M3, parcel);
    }

    public static void D(Parcel parcel, int i7, int[] iArr, boolean z8) {
        if (iArr == null) {
            if (z8) {
                O(parcel, i7, 0);
            }
        } else {
            int M3 = M(i7, parcel);
            parcel.writeIntArray(iArr);
            N(M3, parcel);
        }
    }

    public static void E(Parcel parcel, int i7, Integer num) {
        if (num == null) {
            return;
        }
        O(parcel, i7, 4);
        parcel.writeInt(num.intValue());
    }

    public static void F(Parcel parcel, int i7, Long l10) {
        if (l10 == null) {
            return;
        }
        O(parcel, i7, 8);
        parcel.writeLong(l10.longValue());
    }

    public static void G(Parcel parcel, int i7, Parcelable parcelable, int i10, boolean z8) {
        if (parcelable == null) {
            if (z8) {
                O(parcel, i7, 0);
            }
        } else {
            int M3 = M(i7, parcel);
            parcelable.writeToParcel(parcel, i10);
            N(M3, parcel);
        }
    }

    public static void H(Parcel parcel, int i7, String str, boolean z8) {
        if (str == null) {
            if (z8) {
                O(parcel, i7, 0);
            }
        } else {
            int M3 = M(i7, parcel);
            parcel.writeString(str);
            N(M3, parcel);
        }
    }

    public static void I(Parcel parcel, int i7, String[] strArr, boolean z8) {
        if (strArr == null) {
            if (z8) {
                O(parcel, i7, 0);
            }
        } else {
            int M3 = M(i7, parcel);
            parcel.writeStringArray(strArr);
            N(M3, parcel);
        }
    }

    public static void J(Parcel parcel, int i7, List list) {
        if (list == null) {
            return;
        }
        int M3 = M(i7, parcel);
        parcel.writeStringList(list);
        N(M3, parcel);
    }

    public static void K(Parcel parcel, int i7, Parcelable[] parcelableArr, int i10) {
        if (parcelableArr == null) {
            return;
        }
        int M3 = M(i7, parcel);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i10);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        N(M3, parcel);
    }

    public static void L(Parcel parcel, int i7, List list, boolean z8) {
        if (list == null) {
            if (z8) {
                O(parcel, i7, 0);
                return;
            }
            return;
        }
        int M3 = M(i7, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            Parcelable parcelable = (Parcelable) list.get(i10);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        N(M3, parcel);
    }

    public static int M(int i7, Parcel parcel) {
        parcel.writeInt(i7 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void N(int i7, Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i7 - 4);
        parcel.writeInt(dataPosition - i7);
        parcel.setDataPosition(dataPosition);
    }

    public static void O(Parcel parcel, int i7, int i10) {
        parcel.writeInt(i7 | (i10 << 16));
    }

    public static final long a(float f4, float f10) {
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
    }

    public static void b(StringBuilder sb2, Object obj, Rb.c cVar) {
        if (cVar != null) {
            sb2.append((CharSequence) cVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb2.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb2.append(((Character) obj).charValue());
        } else {
            sb2.append((CharSequence) obj.toString());
        }
    }

    public static final c0.m c(c0.m mVar, D d10) {
        return androidx.compose.ui.graphics.a.b(mVar, 0.0f, d10, true, 124927);
    }

    public static final c0.m d(c0.m mVar) {
        return androidx.compose.ui.graphics.a.b(mVar, 0.0f, null, true, 126975);
    }

    public static i e(b bVar, List list, c cVar) {
        A3.n c0342f;
        A3.n c0337a;
        int i7;
        Resources resources;
        String str;
        D3.a aVar = bVar.f14599a;
        f fVar = bVar.f14601c;
        Context applicationContext = fVar.getApplicationContext();
        R7.a aVar2 = fVar.f14631h;
        i iVar = new i();
        Object obj = new Object();
        O3.c cVar2 = iVar.g;
        synchronized (cVar2) {
            cVar2.f7466a.add(obj);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 27) {
            Object obj2 = new Object();
            O3.c cVar3 = iVar.g;
            synchronized (cVar3) {
                cVar3.f7466a.add(obj2);
            }
        }
        Resources resources2 = applicationContext.getResources();
        ArrayList e2 = iVar.e();
        D3.f fVar2 = bVar.f14602d;
        N3.a aVar3 = new N3.a(applicationContext, e2, aVar, fVar2);
        A3.n g = new G(aVar, new Hc.e(8));
        q qVar = new q(iVar.e(), resources2.getDisplayMetrics(), aVar, fVar2);
        if (i10 < 28 || !((Map) aVar2.f8927b).containsKey(c.class)) {
            c0342f = new C0342f(qVar, 0);
            c0337a = new C0337a(2, qVar, fVar2);
        } else {
            c0337a = new C0343g(1);
            c0342f = new C0343g(0);
        }
        if (i10 >= 28) {
            i7 = i10;
            resources = resources2;
            iVar.d("Animation", InputStream.class, Drawable.class, new L3.a(new q3.e(13, e2, fVar2), 1));
            iVar.d("Animation", ByteBuffer.class, Drawable.class, new L3.a(new q3.e(13, e2, fVar2), 0));
        } else {
            i7 = i10;
            resources = resources2;
        }
        A3.n cVar4 = new L3.c(applicationContext);
        o c0338b = new C0338b(fVar2);
        O3.a aVar4 = new A7.a(2, false);
        O3.a dVar = new O3.d(1);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        iVar.a(ByteBuffer.class, new C(5));
        iVar.a(InputStream.class, new C1191j(fVar2, 11));
        iVar.d("Bitmap", ByteBuffer.class, Bitmap.class, c0342f);
        iVar.d("Bitmap", InputStream.class, Bitmap.class, c0337a);
        String str2 = Build.FINGERPRINT;
        if ("robolectric".equals(str2)) {
            str = "Animation";
        } else {
            str = "Animation";
            iVar.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C0342f(qVar, 1));
        }
        iVar.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new G(aVar, new h8.e(7)));
        iVar.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, g);
        t tVar = C.f4285b;
        iVar.c(Bitmap.class, Bitmap.class, tVar);
        iVar.d("Bitmap", Bitmap.class, Bitmap.class, new J3.C(0));
        iVar.b(Bitmap.class, c0338b);
        Resources resources3 = resources;
        iVar.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C0337a(resources3, c0342f));
        iVar.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C0337a(resources3, c0337a));
        iVar.d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C0337a(resources3, g));
        iVar.b(BitmapDrawable.class, new q3.e(12, aVar, c0338b));
        String str3 = str;
        iVar.d(str3, InputStream.class, N3.c.class, new N3.i(e2, aVar3, fVar2));
        iVar.d(str3, ByteBuffer.class, N3.c.class, aVar3);
        iVar.b(N3.c.class, new h8.e(10));
        iVar.c(C2262d.class, C2262d.class, tVar);
        iVar.d("Bitmap", C2262d.class, Bitmap.class, new C0339c(aVar));
        iVar.d("legacy_append", Uri.class, Drawable.class, cVar4);
        iVar.d("legacy_append", Uri.class, Bitmap.class, new C0337a(1, cVar4, aVar));
        iVar.h(new K3.a(0));
        iVar.c(File.class, ByteBuffer.class, new C(6));
        iVar.c(File.class, InputStream.class, new C9.h(new C(9)));
        iVar.d("legacy_append", File.class, File.class, new J3.C(2));
        iVar.c(File.class, ParcelFileDescriptor.class, new C9.h(new C(8)));
        iVar.c(File.class, File.class, tVar);
        iVar.h(new com.bumptech.glide.load.data.l(fVar2));
        if (!"robolectric".equals(str2)) {
            iVar.h(new K3.a(2));
        }
        t eVar = new E3.e(applicationContext, 1);
        t c0283e = new C0283e(applicationContext, 0);
        t eVar2 = new E6.e(applicationContext, 1);
        Class cls = Integer.TYPE;
        iVar.c(cls, InputStream.class, eVar);
        iVar.c(Integer.class, InputStream.class, eVar);
        iVar.c(cls, AssetFileDescriptor.class, c0283e);
        iVar.c(Integer.class, AssetFileDescriptor.class, c0283e);
        iVar.c(cls, Drawable.class, eVar2);
        iVar.c(Integer.class, Drawable.class, eVar2);
        iVar.c(Uri.class, InputStream.class, new E6.e(applicationContext, 2));
        iVar.c(Uri.class, AssetFileDescriptor.class, new C0283e(applicationContext, 2));
        t c1191j = new C1191j(resources3, 10);
        t zVar = new z(resources3);
        t a9 = new A(resources3, 0);
        iVar.c(Integer.class, Uri.class, c1191j);
        iVar.c(cls, Uri.class, c1191j);
        iVar.c(Integer.class, AssetFileDescriptor.class, zVar);
        iVar.c(cls, AssetFileDescriptor.class, zVar);
        iVar.c(Integer.class, InputStream.class, a9);
        iVar.c(cls, InputStream.class, a9);
        iVar.c(String.class, InputStream.class, new C1191j(9));
        iVar.c(Uri.class, InputStream.class, new C1191j(9));
        iVar.c(String.class, InputStream.class, new C(13));
        iVar.c(String.class, ParcelFileDescriptor.class, new C(12));
        iVar.c(String.class, AssetFileDescriptor.class, new C(11));
        iVar.c(Uri.class, InputStream.class, new D5.i(applicationContext.getAssets(), 10));
        iVar.c(Uri.class, AssetFileDescriptor.class, new C2034c(applicationContext.getAssets(), 14));
        iVar.c(Uri.class, InputStream.class, new E6.e(applicationContext, 3));
        iVar.c(Uri.class, InputStream.class, new E3.e(applicationContext, 2));
        if (i7 >= 29) {
            iVar.c(Uri.class, InputStream.class, new AbstractC0169c(applicationContext, InputStream.class));
            iVar.c(Uri.class, ParcelFileDescriptor.class, new AbstractC0169c(applicationContext, ParcelFileDescriptor.class));
        }
        int i11 = 12;
        iVar.c(Uri.class, InputStream.class, new C1191j(contentResolver, i11));
        iVar.c(Uri.class, ParcelFileDescriptor.class, new D5.i(contentResolver, i11));
        iVar.c(Uri.class, AssetFileDescriptor.class, new C2034c(contentResolver, 15));
        iVar.c(Uri.class, InputStream.class, new C(14));
        iVar.c(URL.class, InputStream.class, new C2399e(5));
        iVar.c(Uri.class, File.class, new C0283e(applicationContext, 1));
        iVar.c(G3.i.class, InputStream.class, new C2034c(17, (byte) 0));
        iVar.c(byte[].class, ByteBuffer.class, new C(2));
        iVar.c(byte[].class, InputStream.class, new C(4));
        iVar.c(Uri.class, Uri.class, tVar);
        iVar.c(Drawable.class, Drawable.class, tVar);
        iVar.d("legacy_append", Drawable.class, Drawable.class, new J3.C(1));
        iVar.i(Bitmap.class, BitmapDrawable.class, new z(resources3));
        iVar.i(Bitmap.class, byte[].class, aVar4);
        iVar.i(Drawable.class, byte[].class, new G0(aVar, aVar4, dVar, 26));
        iVar.i(N3.c.class, byte[].class, dVar);
        A3.n g2 = new G(aVar, new C1332t(7));
        iVar.d("legacy_append", ByteBuffer.class, Bitmap.class, g2);
        iVar.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C0337a(resources3, g2));
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw h3.o.j(it);
        }
        if (cVar != null) {
            cVar.V(applicationContext, bVar, iVar);
        }
        return iVar;
    }

    public static Handler f(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1.i.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e10) {
            e = e10;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e11) {
            e = e11;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [y1.J, java.lang.Object] */
    public static boolean g(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = K.f26642a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = J.f26638d;
        J j = (J) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        J j10 = j;
        if (j == null) {
            ?? obj = new Object();
            obj.f26639a = null;
            obj.f26640b = null;
            obj.f26641c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, obj);
            j10 = obj;
        }
        WeakReference weakReference2 = j10.f26641c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        j10.f26641c = new WeakReference(keyEvent);
        if (j10.f26640b == null) {
            j10.f26640b = new SparseArray();
        }
        SparseArray sparseArray = j10.f26640b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        throw h3.o.i(size, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean h(InterfaceC2362j interfaceC2362j, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z8 = false;
        if (interfaceC2362j == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return interfaceC2362j.c(keyEvent);
        }
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window2 = activity.getWindow();
            if (window2.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                    if (!f14609c) {
                        try {
                            f14610d = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                        } catch (NoSuchMethodException unused) {
                        }
                        f14609c = true;
                    }
                    Method method = f14610d;
                    if (method != null) {
                        try {
                            Object invoke = method.invoke(actionBar, keyEvent);
                            if (invoke != null) {
                                z8 = ((Boolean) invoke).booleanValue();
                            }
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                    if (z8) {
                        return true;
                    }
                }
            }
            if (window2.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window2.getDecorView();
            if (K.c(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
        }
        if (!(callback instanceof Dialog)) {
            return (view != null && K.c(view, keyEvent)) || interfaceC2362j.c(keyEvent);
        }
        Dialog dialog = (Dialog) callback;
        if (!f14611e) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f14612f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f14611e = true;
        }
        Field field = f14612f;
        if (field != null) {
            try {
                onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused4) {
            }
            if (onKeyListener == null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            window = dialog.getWindow();
            if (!window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView2 = window.getDecorView();
            if (K.c(decorView2, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
        }
        onKeyListener = null;
        if (onKeyListener == null) {
        }
        window = dialog.getWindow();
        if (!window.superDispatchKeyEvent(keyEvent)) {
        }
    }

    public static final int i(Context context, int i7) {
        return (int) TypedValue.applyDimension(1, i7, context.getResources().getDisplayMetrics());
    }

    /* JADX WARN: Code restructure failed: missing block: B:258:0x061e, code lost:
    
        if ((r10 >= 0 && r10 < 8) != false) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x06e9, code lost:
    
        if (r8 == false) goto L360;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0775 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02f6 A[LOOP:2: B:68:0x02f4->B:69:0x02f6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x030c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static V8.b j(String str, int i7, int i10, Map map) {
        int i11;
        boolean z8;
        boolean containsKey;
        Charset forName;
        EnumC1647d enumC1647d;
        C1649f c10;
        V8.a aVar;
        C1649f c1649f;
        V8.d dVar;
        int length;
        int i12;
        int i13;
        int i14;
        int i15;
        byte[][] bArr;
        int i16;
        boolean z10;
        boolean z11;
        boolean z12;
        int i17;
        boolean z13;
        char c11;
        int i18;
        int i19 = i7;
        int i20 = 1;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i19 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i19 + 'x' + i10);
        }
        P8.e eVar = P8.e.f8208a;
        if (map.containsKey(eVar)) {
            String obj = map.get(eVar).toString();
            if (obj == null) {
                throw new NullPointerException("Name is null");
            }
            if (!obj.equals("L")) {
                if (obj.equals("M")) {
                    i11 = 2;
                } else if (obj.equals("Q")) {
                    i11 = 3;
                } else {
                    if (!obj.equals("H")) {
                        throw new IllegalArgumentException("No enum constant com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.".concat(obj));
                    }
                    i11 = 4;
                }
                P8.e eVar2 = P8.e.f8210c;
                int parseInt = !map.containsKey(eVar2) ? Integer.parseInt(map.get(eVar2).toString()) : 4;
                int[] iArr = o9.b.f22128a;
                P8.e eVar3 = P8.e.f8214u;
                int i21 = 0;
                boolean z14 = !map.containsKey(eVar3) && Boolean.parseBoolean(map.get(eVar3).toString());
                P8.e eVar4 = P8.e.f8213f;
                z8 = !map.containsKey(eVar4) && Boolean.parseBoolean(map.get(eVar4).toString());
                P8.e eVar5 = P8.e.f8209b;
                containsKey = map.containsKey(eVar5);
                Charset charset = o9.b.f22129b;
                if (containsKey) {
                    try {
                        forName = Charset.forName(map.get(eVar5).toString());
                    } catch (UnsupportedCharsetException unused) {
                    }
                    EnumC1647d enumC1647d2 = EnumC1647d.BYTE;
                    if (z8) {
                        if (forName.equals(charset)) {
                            forName = null;
                        }
                        R7.c cVar = new R7.c(str, forName, z14, i11);
                        C1649f[] c1649fArr = {R7.c.o(1), R7.c.o(2), R7.c.o(3)};
                        X[] xArr = {cVar.n(c1649fArr[0]), cVar.n(c1649fArr[1]), cVar.n(c1649fArr[2])};
                        int i22 = 0;
                        int i23 = Integer.MAX_VALUE;
                        int i24 = -1;
                        for (int i25 = 3; i22 < i25; i25 = 3) {
                            X x2 = xArr[i22];
                            int q10 = x2.q((C1649f) x2.f19195c);
                            if (o9.b.c(q10, c1649fArr[i22], cVar.f8931b) && q10 < i23) {
                                i24 = i22;
                                i23 = q10;
                            }
                            i22++;
                        }
                        if (i24 < 0) {
                            throw new Exception("Data too big for any version");
                        }
                        X x10 = xArr[i24];
                        aVar = new V8.a();
                        Iterator it = ((ArrayList) x10.f19194b).iterator();
                        while (it.hasNext()) {
                            o9.e eVar6 = (o9.e) it.next();
                            EnumC1647d enumC1647d3 = eVar6.f22140a;
                            aVar.b(enumC1647d3.f20805b, 4);
                            int i26 = eVar6.f22143d;
                            X x11 = eVar6.f22144e;
                            if (i26 > 0) {
                                aVar.b(eVar6.a(), enumC1647d3.a((C1649f) x11.f19195c));
                            }
                            EnumC1647d enumC1647d4 = EnumC1647d.ECI;
                            int i27 = eVar6.f22142c;
                            if (enumC1647d3 == enumC1647d4) {
                                aVar.b(((V8.d) V8.d.f10202d.get(((V8.f) ((R7.c) x11.f19196d).f8934e).f10215a[i27].charset().name())).f10204a[0], 8);
                            } else if (i26 > 0) {
                                String str2 = (String) ((R7.c) x11.f19196d).f8933d;
                                int i28 = eVar6.f22141b;
                                o9.b.a(str2.substring(i28, i26 + i28), enumC1647d3, aVar, ((V8.f) ((R7.c) x11.f19196d).f8934e).f10215a[i27].charset());
                            }
                        }
                        c1649f = (C1649f) x10.f19195c;
                    } else {
                        Charset charset2 = V8.i.f10231b;
                        if (charset2 != null && charset2.equals(forName) && o9.b.b(str)) {
                            enumC1647d = EnumC1647d.KANJI;
                        } else {
                            int i29 = 0;
                            boolean z15 = false;
                            boolean z16 = false;
                            while (true) {
                                if (i29 < str.length()) {
                                    char charAt = str.charAt(i29);
                                    if (charAt < '0' || charAt > '9') {
                                        if ((charAt < '`' ? o9.b.f22128a[charAt] : -1) == -1) {
                                            break;
                                        }
                                        z15 = true;
                                    } else {
                                        z16 = true;
                                    }
                                    i29++;
                                } else if (z15) {
                                    enumC1647d = EnumC1647d.ALPHANUMERIC;
                                } else if (z16) {
                                    enumC1647d = EnumC1647d.NUMERIC;
                                }
                            }
                            enumC1647d = enumC1647d2;
                        }
                        V8.a aVar2 = new V8.a();
                        if (enumC1647d == enumC1647d2 && containsKey && (dVar = (V8.d) V8.d.f10202d.get(forName.name())) != null) {
                            aVar2.b(7, 4);
                            aVar2.b(dVar.f10204a[0], 8);
                        }
                        if (z14) {
                            aVar2.b(5, 4);
                        }
                        aVar2.b(enumC1647d.f20805b, 4);
                        V8.a aVar3 = new V8.a();
                        o9.b.a(str, enumC1647d, aVar3, forName);
                        P8.e eVar7 = P8.e.f8211d;
                        if (!map.containsKey(eVar7)) {
                            int a9 = enumC1647d.a(C1649f.c(1)) + aVar2.f10193b + aVar3.f10193b;
                            int i30 = 1;
                            while (i30 <= 40) {
                                C1649f c12 = C1649f.c(i30);
                                if (o9.b.c(a9, c12, i11)) {
                                    int a10 = enumC1647d.a(c12) + aVar2.f10193b + aVar3.f10193b;
                                    int i31 = i20;
                                    int i32 = 40;
                                    while (i31 <= i32) {
                                        c10 = C1649f.c(i31);
                                        if (!o9.b.c(a10, c10, i11)) {
                                            i31++;
                                            i19 = i19;
                                            i20 = i20;
                                            i21 = 0;
                                            i32 = 40;
                                            parseInt = parseInt;
                                        }
                                    }
                                    throw new Exception("Data too big");
                                }
                                i30++;
                                i19 = i19;
                                i20 = i20;
                                parseInt = parseInt;
                                i21 = 0;
                            }
                            throw new Exception("Data too big");
                        }
                        C1649f c13 = C1649f.c(Integer.parseInt(map.get(eVar7).toString()));
                        if (!o9.b.c(enumC1647d.a(c13) + aVar2.f10193b + aVar3.f10193b, c13, i11)) {
                            throw new Exception("Data too big for requested version");
                        }
                        c10 = c13;
                        aVar = new V8.a();
                        int i33 = aVar2.f10193b;
                        aVar.c(i33);
                        for (int i34 = i21; i34 < i33; i34 += i20) {
                            aVar.a(aVar2.d(i34));
                        }
                        int g = enumC1647d == enumC1647d2 ? aVar3.g() : str.length();
                        int a11 = enumC1647d.a(c10);
                        int i35 = i20 << a11;
                        if (g >= i35) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(g);
                            sb2.append(" is bigger than ");
                            sb2.append(i35 - 1);
                            throw new Exception(sb2.toString());
                        }
                        aVar.b(g, a11);
                        int i36 = aVar3.f10193b;
                        aVar.c(aVar.f10193b + i36);
                        for (int i37 = 0; i37 < i36; i37 += i20) {
                            aVar.a(aVar3.d(i37));
                        }
                        c1649f = c10;
                    }
                    A7.a aVar4 = c1649f.f20810c[P.c.b(i11)];
                    O[] oArr = (O[]) aVar4.f532b;
                    length = oArr.length;
                    int i38 = 0;
                    for (i12 = 0; i12 < length; i12 += i20) {
                        i38 += oArr[i12].f4603b;
                    }
                    int i39 = i38 * aVar4.f531a;
                    int i40 = c1649f.f20811d;
                    int i41 = i40 - i39;
                    i13 = i41 * 8;
                    if (aVar.f10193b > i13) {
                        throw new Exception("data bits cannot fit in the QR Code" + aVar.f10193b + " > " + i13);
                    }
                    for (int i42 = 0; i42 < 4 && aVar.f10193b < i13; i42 += i20) {
                        aVar.a(false);
                    }
                    boolean z17 = false;
                    int i43 = aVar.f10193b & 7;
                    if (i43 > 0) {
                        while (i43 < 8) {
                            aVar.a(z17);
                            i43 += i20;
                            z17 = false;
                        }
                    }
                    int g2 = i41 - aVar.g();
                    for (int i44 = 0; i44 < g2; i44 += i20) {
                        aVar.b((i44 & 1) == 0 ? 236 : 17, 8);
                    }
                    if (aVar.f10193b != i13) {
                        throw new Exception("Bits size does not equal capacity");
                    }
                    O[] oArr2 = (O[]) aVar4.f532b;
                    int length2 = oArr2.length;
                    int i45 = 0;
                    for (int i46 = 0; i46 < length2; i46 += i20) {
                        i45 += oArr2[i46].f4603b;
                    }
                    if (aVar.g() != i41) {
                        throw new Exception("Number of bits and data bytes does not match");
                    }
                    ArrayList arrayList = new ArrayList(i45);
                    int i47 = 0;
                    int i48 = 0;
                    int i49 = 0;
                    int i50 = 0;
                    while (i47 < i45) {
                        int[] iArr2 = new int[i20];
                        int[] iArr3 = new int[i20];
                        if (i47 >= i45) {
                            throw new Exception("Block ID too large");
                        }
                        int i51 = i40 % i45;
                        int i52 = parseInt;
                        int i53 = i45 - i51;
                        int i54 = i40 / i45;
                        int i55 = i54 + 1;
                        int i56 = i41 / i45;
                        int i57 = i56 + 1;
                        int i58 = i54 - i56;
                        int i59 = i11;
                        int i60 = i55 - i57;
                        if (i58 != i60) {
                            throw new Exception("EC bytes mismatch");
                        }
                        if (i45 != i53 + i51) {
                            throw new Exception("RS blocks mismatch");
                        }
                        if (i40 != ((i57 + i60) * i51) + ((i56 + i58) * i53)) {
                            throw new Exception("Total bytes mismatch");
                        }
                        if (i47 < i53) {
                            c11 = 0;
                            iArr2[0] = i56;
                            iArr3[0] = i58;
                        } else {
                            c11 = 0;
                            iArr2[0] = i57;
                            iArr3[0] = i60;
                        }
                        int i61 = iArr2[c11];
                        byte[] bArr2 = new byte[i61];
                        int i62 = i48 * 8;
                        int i63 = 0;
                        while (i63 < i61) {
                            C1649f c1649f2 = c1649f;
                            int i64 = i40;
                            int i65 = i45;
                            int i66 = 0;
                            int i67 = 0;
                            for (int i68 = 8; i67 < i68; i68 = 8) {
                                if (aVar.d(i62)) {
                                    i18 = 1;
                                    i66 |= 1 << (7 - i67);
                                } else {
                                    i18 = 1;
                                }
                                i62 += i18;
                                i67 += i18;
                            }
                            bArr2[i63] = (byte) i66;
                            i63++;
                            i45 = i65;
                            c1649f = c1649f2;
                            i40 = i64;
                        }
                        C1649f c1649f3 = c1649f;
                        int i69 = i40;
                        int i70 = i45;
                        int i71 = iArr3[0];
                        int i72 = i61 + i71;
                        int[] iArr4 = new int[i72];
                        for (int i73 = 0; i73 < i61; i73++) {
                            iArr4[i73] = bArr2[i73] & 255;
                        }
                        int i74 = 1;
                        X8.a aVar5 = X8.a.f11005l;
                        ArrayList arrayList2 = new ArrayList();
                        V8.a aVar6 = aVar;
                        int i75 = i41;
                        arrayList2.add(new X8.b(aVar5, new int[]{1}));
                        if (i71 == 0) {
                            throw new IllegalArgumentException("No error correction bytes");
                        }
                        int i76 = i72 - i71;
                        if (i76 <= 0) {
                            throw new IllegalArgumentException("No data bytes provided");
                        }
                        if (i71 >= arrayList2.size()) {
                            X8.b bVar = (X8.b) h3.o.k(1, arrayList2);
                            int size = arrayList2.size();
                            while (size <= i71) {
                                bVar = bVar.g(new X8.b(aVar5, new int[]{1, aVar5.f11009a[(size - 1) + aVar5.g]}));
                                arrayList2.add(bVar);
                                size++;
                                i74 = 1;
                                i47 = i47;
                                i48 = i48;
                            }
                        }
                        int i77 = i47;
                        int i78 = i48;
                        int i79 = i74;
                        X8.b bVar2 = (X8.b) arrayList2.get(i71);
                        int[] iArr5 = new int[i76];
                        System.arraycopy(iArr4, 0, iArr5, 0, i76);
                        if (i76 == 0) {
                            throw new IllegalArgumentException();
                        }
                        if (i76 > i79 && iArr5[0] == 0) {
                            int i80 = i79;
                            while (i80 < i76 && iArr5[i80] == 0) {
                                i80 += i79;
                            }
                            if (i80 == i76) {
                                iArr5 = new int[]{0};
                            } else {
                                int i81 = i76 - i80;
                                int[] iArr6 = new int[i81];
                                System.arraycopy(iArr5, i80, iArr6, 0, i81);
                                iArr5 = iArr6;
                            }
                        }
                        if (i71 < 0) {
                            throw new IllegalArgumentException();
                        }
                        int length3 = iArr5.length;
                        int[] iArr7 = new int[length3 + i71];
                        int i82 = 0;
                        while (i82 < length3) {
                            iArr7[i82] = aVar5.c(iArr5[i82], 1);
                            i82++;
                            iArr5 = iArr5;
                        }
                        X8.b bVar3 = new X8.b(aVar5, iArr7);
                        if (!aVar5.equals(bVar2.f11015a)) {
                            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                        }
                        if (bVar2.e()) {
                            throw new IllegalArgumentException("Divide by 0");
                        }
                        int b2 = aVar5.b(bVar2.c(bVar2.d()));
                        X8.b bVar4 = aVar5.f11011c;
                        while (bVar3.d() >= bVar2.d() && !bVar3.e()) {
                            int d10 = bVar3.d() - bVar2.d();
                            int c14 = aVar5.c(bVar3.c(bVar3.d()), b2);
                            int i83 = b2;
                            X8.b h10 = bVar2.h(d10, c14);
                            bVar4 = bVar4.a(aVar5.a(d10, c14));
                            bVar3 = bVar3.a(h10);
                            b2 = i83;
                        }
                        int[] iArr8 = new X8.b[]{bVar4, bVar3}[1].f11016b;
                        int length4 = i71 - iArr8.length;
                        for (int i84 = 0; i84 < length4; i84++) {
                            iArr4[i76 + i84] = 0;
                        }
                        System.arraycopy(iArr8, 0, iArr4, i76 + length4, iArr8.length);
                        byte[] bArr3 = new byte[i71];
                        for (int i85 = 0; i85 < i71; i85++) {
                            bArr3[i85] = (byte) iArr4[i61 + i85];
                        }
                        arrayList.add(new C1825a(bArr2, bArr3));
                        i50 = Math.max(i50, i61);
                        i49 = Math.max(i49, i71);
                        i48 = i78 + iArr2[0];
                        i47 = i77 + 1;
                        i20 = 1;
                        i45 = i70;
                        parseInt = i52;
                        i11 = i59;
                        c1649f = c1649f3;
                        i40 = i69;
                        aVar = aVar6;
                        i41 = i75;
                    }
                    C1649f c1649f4 = c1649f;
                    int i86 = i40;
                    int i87 = i11;
                    int i88 = parseInt;
                    if (i41 != i48) {
                        throw new Exception("Data bytes does not match offset");
                    }
                    V8.a aVar7 = new V8.a();
                    for (int i89 = 0; i89 < i50; i89++) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            byte[] bArr4 = ((C1825a) it2.next()).f22126a;
                            if (i89 < bArr4.length) {
                                aVar7.b(bArr4[i89], 8);
                            }
                        }
                    }
                    for (int i90 = 0; i90 < i49; i90++) {
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            byte[] bArr5 = ((C1825a) it3.next()).f22127b;
                            if (i90 < bArr5.length) {
                                aVar7.b(bArr5[i90], 8);
                            }
                        }
                    }
                    if (i86 != aVar7.g()) {
                        StringBuilder r10 = h3.o.r(i86, "Interleaving error: ", " and ");
                        r10.append(aVar7.g());
                        r10.append(" differ.");
                        throw new Exception(r10.toString());
                    }
                    int i91 = (c1649f4.f20808a * 4) + 17;
                    A4.h hVar = new A4.h(i91, i91);
                    P8.e eVar8 = P8.e.f8212e;
                    if (map.containsKey(eVar8)) {
                        i14 = Integer.parseInt(map.get(eVar8).toString());
                    }
                    i14 = -1;
                    int i92 = hVar.f385b;
                    int i93 = hVar.f386c;
                    int i94 = -1;
                    if (i14 == -1) {
                        int i95 = Integer.MAX_VALUE;
                        int i96 = 0;
                        while (i96 < 8) {
                            int i97 = i87;
                            o9.c.b(aVar7, i97, c1649f4, i96, hVar);
                            int i98 = 0;
                            int a12 = o9.c.a(hVar, false) + o9.c.a(hVar, true);
                            int i99 = 0;
                            int i100 = 0;
                            while (true) {
                                int i101 = i93 - 1;
                                bArr = (byte[][]) hVar.f387d;
                                if (i99 >= i101) {
                                    break;
                                }
                                byte[] bArr6 = bArr[i99];
                                int i102 = i94;
                                while (i98 < i92 - 1) {
                                    byte b10 = bArr6[i98];
                                    int i103 = i98 + 1;
                                    V8.a aVar8 = aVar7;
                                    if (b10 == bArr6[i103]) {
                                        byte[] bArr7 = bArr[i99 + 1];
                                        if (b10 == bArr7[i98] && b10 == bArr7[i103]) {
                                            i100++;
                                        }
                                    }
                                    i98 = i103;
                                    aVar7 = aVar8;
                                }
                                i99++;
                                i94 = i102;
                                i98 = 0;
                            }
                            V8.a aVar9 = aVar7;
                            int i104 = i94;
                            int i105 = (i100 * 3) + a12;
                            int i106 = 0;
                            for (int i107 = 0; i107 < i93; i107++) {
                                for (int i108 = 0; i108 < i92; i108 += i16) {
                                    byte[] bArr8 = bArr[i107];
                                    int i109 = i108 + 6;
                                    if (i109 < i92 && bArr8[i108] == 1 && bArr8[i108 + 1] == 0 && bArr8[i108 + 2] == 1 && bArr8[i108 + 3] == 1 && bArr8[i108 + 4] == 1 && bArr8[i108 + 5] == 0 && bArr8[i109] == 1) {
                                        int i110 = i108 - 4;
                                        if (i110 >= 0 && bArr8.length >= i108) {
                                            while (i110 < i108) {
                                                if (bArr8[i110] != 1) {
                                                    i110++;
                                                }
                                            }
                                            z12 = true;
                                            if (z12) {
                                                int i111 = i108 + 7;
                                                int i112 = i108 + 11;
                                                if (i111 < 0 || bArr8.length < i112) {
                                                    i17 = 1;
                                                } else {
                                                    while (i111 < i112) {
                                                        byte b11 = bArr8[i111];
                                                        byte[] bArr9 = bArr8;
                                                        i17 = 1;
                                                        if (b11 != 1) {
                                                            i111++;
                                                            bArr8 = bArr9;
                                                        }
                                                    }
                                                    i17 = 1;
                                                    z13 = true;
                                                }
                                                z13 = false;
                                                break;
                                            } else {
                                                i17 = 1;
                                            }
                                            i106 += i17;
                                        }
                                        z12 = false;
                                        if (z12) {
                                        }
                                        i106 += i17;
                                    }
                                    int i113 = i107 + 6;
                                    if (i113 < i93) {
                                        i16 = 1;
                                        if (bArr[i107][i108] == 1 && bArr[i107 + 1][i108] == 0 && bArr[i107 + 2][i108] == 1) {
                                            if (bArr[i107 + 3][i108] == 1 && bArr[i107 + 4][i108] == 1 && bArr[i107 + 5][i108] == 0 && bArr[i113][i108] == 1) {
                                                int i114 = i107 - 4;
                                                if (i114 >= 0 && bArr.length >= i107) {
                                                    while (i114 < i107) {
                                                        if (bArr[i114][i108] != 1) {
                                                            i114++;
                                                        }
                                                    }
                                                    z10 = true;
                                                    if (z10) {
                                                        int i115 = i107 + 7;
                                                        int i116 = i107 + 11;
                                                        if (i115 < 0 || bArr.length < i116) {
                                                            i16 = 1;
                                                        } else {
                                                            while (i115 < i116) {
                                                                i16 = 1;
                                                                if (bArr[i115][i108] != 1) {
                                                                    i115++;
                                                                }
                                                            }
                                                            i16 = 1;
                                                            z11 = true;
                                                            if (!z11) {
                                                            }
                                                        }
                                                        z11 = false;
                                                        if (!z11) {
                                                        }
                                                    } else {
                                                        i16 = 1;
                                                    }
                                                    i106 += i16;
                                                }
                                                z10 = false;
                                                if (z10) {
                                                }
                                                i106 += i16;
                                            }
                                        }
                                    } else {
                                        i16 = 1;
                                    }
                                }
                            }
                            int i117 = (i106 * 40) + i105;
                            int i118 = 0;
                            for (int i119 = 0; i119 < i93; i119++) {
                                byte[] bArr10 = bArr[i119];
                                for (int i120 = 0; i120 < i92; i120++) {
                                    if (bArr10[i120] == 1) {
                                        i118++;
                                    }
                                }
                            }
                            int i121 = i93 * i92;
                            int abs = (((Math.abs((i118 * 2) - i121) * 10) / i121) * 10) + i117;
                            if (abs < i95) {
                                i95 = abs;
                                i94 = i96;
                            } else {
                                i94 = i104;
                            }
                            i96++;
                            i87 = i97;
                            aVar7 = aVar9;
                        }
                        i15 = i87;
                        i14 = i94;
                    } else {
                        i15 = i87;
                    }
                    o9.c.b(aVar7, i15, c1649f4, i14, hVar);
                    int i122 = i88 * 2;
                    int i123 = i92 + i122;
                    int i124 = i122 + i93;
                    int max = Math.max(i7, i123);
                    int max2 = Math.max(i10, i124);
                    int min = Math.min(max / i123, max2 / i124);
                    int i125 = (max - (i92 * min)) / 2;
                    int i126 = (max2 - (i93 * min)) / 2;
                    V8.b bVar5 = new V8.b(max, max2);
                    int i127 = 0;
                    while (i127 < i93) {
                        int i128 = i125;
                        int i129 = 0;
                        while (i129 < i92) {
                            if (hVar.r(i129, i127) == 1) {
                                bVar5.i(i128, i126, min, min);
                            }
                            i129++;
                            i128 += min;
                        }
                        i127++;
                        i126 += min;
                    }
                    return bVar5;
                }
                forName = charset;
                EnumC1647d enumC1647d22 = EnumC1647d.BYTE;
                if (z8) {
                }
                A7.a aVar42 = c1649f.f20810c[P.c.b(i11)];
                O[] oArr3 = (O[]) aVar42.f532b;
                length = oArr3.length;
                int i382 = 0;
                while (i12 < length) {
                }
                int i392 = i382 * aVar42.f531a;
                int i402 = c1649f.f20811d;
                int i412 = i402 - i392;
                i13 = i412 * 8;
                if (aVar.f10193b > i13) {
                }
            }
        }
        i11 = 1;
        P8.e eVar22 = P8.e.f8210c;
        if (!map.containsKey(eVar22)) {
        }
        int[] iArr9 = o9.b.f22128a;
        P8.e eVar32 = P8.e.f8214u;
        int i212 = 0;
        if (map.containsKey(eVar32)) {
        }
        P8.e eVar42 = P8.e.f8213f;
        if (map.containsKey(eVar42)) {
        }
        P8.e eVar52 = P8.e.f8209b;
        containsKey = map.containsKey(eVar52);
        Charset charset3 = o9.b.f22129b;
        if (containsKey) {
        }
        forName = charset3;
        EnumC1647d enumC1647d222 = EnumC1647d.BYTE;
        if (z8) {
        }
        A7.a aVar422 = c1649f.f20810c[P.c.b(i11)];
        O[] oArr32 = (O[]) aVar422.f532b;
        length = oArr32.length;
        int i3822 = 0;
        while (i12 < length) {
        }
        int i3922 = i3822 * aVar422.f531a;
        int i4022 = c1649f.f20811d;
        int i4122 = i4022 - i3922;
        i13 = i4122 * 8;
        if (aVar.f10193b > i13) {
        }
    }

    public static final boolean k(int i7, int i10) {
        return i7 == i10;
    }

    public static final boolean l(int i7, int i10) {
        return i7 == i10;
    }

    public static final long o(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static V2.c q(R7.a refHolder, SQLiteDatabase sQLiteDatabase) {
        kotlin.jvm.internal.l.e(refHolder, "refHolder");
        V2.c cVar = (V2.c) refHolder.f8927b;
        if (cVar != null && cVar.f9999a.equals(sQLiteDatabase)) {
            return cVar;
        }
        V2.c cVar2 = new V2.c(sQLiteDatabase);
        refHolder.f8927b = cVar2;
        return cVar2;
    }

    public static boolean r(Context context) {
        ((oa.j) ((Xa.a) Q5.e.v(context, Xa.a.class))).getClass();
        int i7 = L.f7237c;
        z0 z0Var = z0.f7379x;
        c.h(z0Var.f7384v <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (z0Var.isEmpty()) {
            return true;
        }
        return ((Boolean) ((F) z0Var.iterator()).next()).booleanValue();
    }

    public static void t(Throwable th) {
        if (th == null) {
            th = AbstractC2275c.a("onError called with a null Throwable.");
        } else if (!(th instanceof C1361c) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof C1360b)) {
            th = new IllegalStateException("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | " + th, th);
        }
        th.printStackTrace();
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public static void u(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException(X.c.g(cls.getDeclaredConstructor(null).newInstance(null), "Expected instanceof GlideModule, but found: "));
            } catch (IllegalAccessException e2) {
                w(cls, e2);
                throw null;
            } catch (InstantiationException e10) {
                w(cls, e10);
                throw null;
            } catch (NoSuchMethodException e11) {
                w(cls, e11);
                throw null;
            } catch (InvocationTargetException e12) {
                w(cls, e12);
                throw null;
            }
        } catch (ClassNotFoundException e13) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01b1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList v(v vVar) {
        ArrayList arrayList;
        boolean z8;
        int i7;
        ArrayList arrayList2;
        C1854e c1854e;
        v vVar2 = vVar;
        C1854e c1854e2 = null;
        if (vVar.v() != 0) {
            return null;
        }
        vVar2.H(7);
        int h10 = vVar.h();
        boolean z10 = true;
        if (h10 == 1684433976) {
            v vVar3 = new v();
            Inflater inflater = new Inflater(true);
            try {
                if (!n5.D.I(vVar2, vVar3, inflater)) {
                    return null;
                }
                inflater.end();
                vVar2 = vVar3;
            } finally {
                inflater.end();
            }
        } else if (h10 != 1918990112) {
            return null;
        }
        ArrayList arrayList3 = new ArrayList();
        int i10 = vVar2.f21230b;
        int i11 = vVar2.f21231c;
        while (i10 < i11) {
            int h11 = vVar2.h() + i10;
            if (h11 > i10 && h11 <= i11) {
                if (vVar2.h() == 1835365224) {
                    int h12 = vVar2.h();
                    if (h12 <= 10000) {
                        float[] fArr = new float[h12];
                        for (int i12 = 0; i12 < h12; i12++) {
                            fArr[i12] = Float.intBitsToFloat(vVar2.h());
                        }
                        int h13 = vVar2.h();
                        if (h13 <= 32000) {
                            double log = Math.log(2.0d);
                            arrayList2 = arrayList3;
                            int ceil = (int) Math.ceil(Math.log(h12 * 2.0d) / log);
                            byte[] bArr = vVar2.f21229a;
                            b5.f fVar = new b5.f(bArr, bArr.length);
                            fVar.p(vVar2.f21230b * 8);
                            float[] fArr2 = new float[h13 * 5];
                            int i13 = 5;
                            int[] iArr = new int[5];
                            int i14 = 0;
                            int i15 = 0;
                            while (true) {
                                if (i14 < h13) {
                                    int i16 = 0;
                                    while (i16 < i13) {
                                        int i17 = iArr[i16];
                                        int i18 = fVar.i(ceil);
                                        int i19 = ((i18 >> 1) ^ (-(i18 & 1))) + i17;
                                        if (i19 >= h12 || i19 < 0) {
                                            break;
                                        }
                                        fArr2[i15] = fArr[i19];
                                        iArr[i16] = i19;
                                        i16++;
                                        i15++;
                                        i13 = 5;
                                    }
                                    i14++;
                                    i13 = 5;
                                } else {
                                    fVar.p((fVar.g() + 7) & (-8));
                                    int i20 = 32;
                                    int i21 = fVar.i(32);
                                    C6.l[] lVarArr = new C6.l[i21];
                                    int i22 = 0;
                                    while (i22 < i21) {
                                        int i23 = fVar.i(8);
                                        int i24 = fVar.i(8);
                                        int i25 = fVar.i(i20);
                                        if (i25 <= 128000) {
                                            i7 = i11;
                                            int ceil2 = (int) Math.ceil(Math.log(h13 * 2.0d) / log);
                                            float[] fArr3 = new float[i25 * 3];
                                            float[] fArr4 = new float[i25 * 2];
                                            int i26 = 0;
                                            int i27 = 0;
                                            while (i26 < i25) {
                                                int i28 = fVar.i(ceil2);
                                                b5.f fVar2 = fVar;
                                                float[] fArr5 = fArr4;
                                                int i29 = i21;
                                                int i30 = ((i28 >> 1) ^ (-(i28 & 1))) + i27;
                                                if (i30 < 0 || i30 >= h13) {
                                                    z8 = true;
                                                } else {
                                                    int i31 = i26 * 3;
                                                    int i32 = i30 * 5;
                                                    fArr3[i31] = fArr2[i32];
                                                    fArr3[i31 + 1] = fArr2[i32 + 1];
                                                    fArr3[i31 + 2] = fArr2[i32 + 2];
                                                    int i33 = i26 * 2;
                                                    fArr5[i33] = fArr2[i32 + 3];
                                                    fArr5[i33 + 1] = fArr2[i32 + 4];
                                                    i26++;
                                                    i27 = i30;
                                                    fVar = fVar2;
                                                    fArr4 = fArr5;
                                                    i21 = i29;
                                                }
                                            }
                                            lVarArr[i22] = new C6.l(i23, i24, fArr3, fArr4);
                                            i22++;
                                            i11 = i7;
                                            z10 = true;
                                            i21 = i21;
                                            i20 = 32;
                                        }
                                    }
                                    z8 = z10;
                                    i7 = i11;
                                    c1854e = new C1854e(lVarArr);
                                }
                            }
                            z8 = z10;
                            i7 = i11;
                            c1854e = null;
                            if (c1854e == null) {
                                arrayList = arrayList2;
                                arrayList.add(c1854e);
                            }
                        }
                    }
                    c1854e = c1854e2;
                    arrayList2 = arrayList3;
                    z8 = z10;
                    i7 = i11;
                    if (c1854e == null) {
                    }
                } else {
                    arrayList = arrayList3;
                    z8 = z10;
                    i7 = i11;
                }
                vVar2.G(h11);
                arrayList3 = arrayList;
                i10 = h11;
                i11 = i7;
                z10 = z8;
                c1854e2 = null;
            }
            return null;
        }
        return arrayList3;
    }

    public static void w(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    public static final Db.j x(String str, String str2) {
        return new Db.j(str, str2);
    }

    public static void y(Parcel parcel, int i7, Boolean bool) {
        if (bool == null) {
            return;
        }
        O(parcel, i7, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void z(Parcel parcel, int i7, Bundle bundle, boolean z8) {
        if (bundle == null) {
            if (z8) {
                O(parcel, i7, 0);
            }
        } else {
            int M3 = M(i7, parcel);
            parcel.writeBundle(bundle);
            N(M3, parcel);
        }
    }

    public abstract Method m(Class cls, Field field);

    public abstract Constructor n(Class cls);

    public abstract String[] p(Class cls);

    public abstract boolean s(Class cls);
}
