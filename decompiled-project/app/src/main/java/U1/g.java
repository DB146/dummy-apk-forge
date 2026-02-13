package U1;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import h3.o;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: D, reason: collision with root package name */
    public static final String[] f9471D;

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f9472E;

    /* renamed from: F, reason: collision with root package name */
    public static final byte[] f9473F;

    /* renamed from: G, reason: collision with root package name */
    public static final d f9474G;

    /* renamed from: H, reason: collision with root package name */
    public static final d[][] f9475H;

    /* renamed from: I, reason: collision with root package name */
    public static final d[] f9476I;

    /* renamed from: J, reason: collision with root package name */
    public static final HashMap[] f9477J;

    /* renamed from: K, reason: collision with root package name */
    public static final HashMap[] f9478K;
    public static final HashSet L;

    /* renamed from: M, reason: collision with root package name */
    public static final HashMap f9479M;

    /* renamed from: N, reason: collision with root package name */
    public static final Charset f9480N;

    /* renamed from: O, reason: collision with root package name */
    public static final byte[] f9481O;

    /* renamed from: P, reason: collision with root package name */
    public static final byte[] f9482P;

    /* renamed from: a, reason: collision with root package name */
    public final FileDescriptor f9498a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager.AssetInputStream f9499b;

    /* renamed from: c, reason: collision with root package name */
    public int f9500c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap[] f9501d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f9502e;

    /* renamed from: f, reason: collision with root package name */
    public ByteOrder f9503f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public int f9504h;

    /* renamed from: i, reason: collision with root package name */
    public int f9505i;
    public int j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f9483l = Log.isLoggable("ExifInterface", 3);

    /* renamed from: m, reason: collision with root package name */
    public static final List f9484m = Arrays.asList(1, 6, 3, 8);

    /* renamed from: n, reason: collision with root package name */
    public static final List f9485n = Arrays.asList(2, 7, 4, 5);

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f9486o = {8, 8, 8};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f9487p = {8};

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f9488q = {-1, -40, -1};

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f9489r = {102, 116, 121, 112};

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f9490s = {109, 105, 102, 49};

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f9491t = {104, 101, 105, 99};

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f9492u = {79, 76, 89, 77, 80, 0};

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f9493v = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f9494w = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f9495x = {101, 88, 73, 102};

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f9496y = {73, 72, 68, 82};

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f9497z = {73, 69, 78, 68};

    /* renamed from: A, reason: collision with root package name */
    public static final byte[] f9468A = {82, 73, 70, 70};

    /* renamed from: B, reason: collision with root package name */
    public static final byte[] f9469B = {87, 69, 66, 80};

    /* renamed from: C, reason: collision with root package name */
    public static final byte[] f9470C = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f9471D = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f9472E = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f9473F = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, 4, "ImageWidth"), new d(257, 3, 4, "ImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d(40962, 3, 4, "PixelXDimension"), new d(40963, 3, 4, "PixelYDimension"), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d(2, 5, 10, "GPSLatitude"), new d("GPSLongitudeRef", 3, 2), new d(4, 5, 10, "GPSLongitude"), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, 4, "ThumbnailImageWidth"), new d(257, 3, 4, "ThumbnailImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")};
        f9474G = new d("StripOffsets", 273, 3);
        f9475H = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        f9476I = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f9477J = new HashMap[10];
        f9478K = new HashMap[10];
        L = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f9479M = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        f9480N = forName;
        f9481O = "Exif\u0000\u0000".getBytes(forName);
        f9482P = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i7 = 0;
        while (true) {
            d[][] dVarArr6 = f9475H;
            if (i7 >= dVarArr6.length) {
                HashMap hashMap = f9479M;
                d[] dVarArr7 = f9476I;
                hashMap.put(Integer.valueOf(dVarArr7[0].f9462a), 5);
                hashMap.put(Integer.valueOf(dVarArr7[1].f9462a), 1);
                hashMap.put(Integer.valueOf(dVarArr7[2].f9462a), 2);
                hashMap.put(Integer.valueOf(dVarArr7[3].f9462a), 3);
                hashMap.put(Integer.valueOf(dVarArr7[4].f9462a), 7);
                hashMap.put(Integer.valueOf(dVarArr7[5].f9462a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f9477J[i7] = new HashMap();
            f9478K[i7] = new HashMap();
            for (d dVar : dVarArr6[i7]) {
                f9477J[i7].put(Integer.valueOf(dVar.f9462a), dVar);
                f9478K[i7].put(dVar.f9463b, dVar);
            }
            i7++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ed A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8 A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005e, blocks: (B:6:0x004f, B:8:0x0052, B:10:0x0067, B:16:0x0084, B:18:0x008f, B:19:0x00a5, B:28:0x0096, B:31:0x009e, B:32:0x00a2, B:33:0x00af, B:35:0x00b8, B:37:0x00be, B:39:0x00c4, B:41:0x00ca, B:51:0x00d8), top: B:5:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(InputStream inputStream) {
        d[][] dVarArr = f9475H;
        this.f9501d = new HashMap[dVarArr.length];
        this.f9502e = new HashSet(dVarArr.length);
        this.f9503f = ByteOrder.BIG_ENDIAN;
        boolean z8 = inputStream instanceof AssetManager.AssetInputStream;
        boolean z10 = f9483l;
        if (z8) {
            this.f9499b = (AssetManager.AssetInputStream) inputStream;
            this.f9498a = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    h.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.f9499b = null;
                    this.f9498a = fileInputStream.getFD();
                } catch (Exception unused) {
                    if (z10) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                }
            }
            this.f9499b = null;
            this.f9498a = null;
        }
        for (int i7 = 0; i7 < dVarArr.length; i7++) {
            try {
                try {
                    this.f9501d[i7] = new HashMap();
                } catch (Throwable th) {
                    a();
                    if (z10) {
                        p();
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                if (z10) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z10) {
                    return;
                }
                p();
            } catch (UnsupportedOperationException e10) {
                e = e10;
                if (z10) {
                }
                a();
                if (!z10) {
                }
                p();
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int f4 = f(bufferedInputStream);
        this.f9500c = f4;
        if (f4 != 4 && f4 != 9 && f4 != 13 && f4 != 14) {
            f fVar = new f(bufferedInputStream);
            int i10 = this.f9500c;
            if (i10 == 12) {
                d(fVar);
            } else if (i10 == 7) {
                g(fVar);
            } else if (i10 == 10) {
                k(fVar);
            } else {
                j(fVar);
            }
            fVar.n(this.f9504h);
            u(fVar);
            a();
            if (!z10) {
                return;
            }
            p();
        }
        b bVar = new b(bufferedInputStream);
        int i11 = this.f9500c;
        if (i11 == 4) {
            e(bVar, 0, 0);
        } else if (i11 == 13) {
            h(bVar);
        } else if (i11 == 9) {
            i(bVar);
        } else if (i11 == 14) {
            l(bVar);
        }
        a();
        if (!z10) {
        }
        p();
    }

    public static ByteOrder q(b bVar) {
        short readShort = bVar.readShort();
        boolean z8 = f9483l;
        if (readShort == 18761) {
            if (z8) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (z8) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final void a() {
        String b2 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.f9501d;
        if (b2 != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b2.concat("\u0000").getBytes(f9480N);
            hashMap.put("DateTime", new c(2, bytes, bytes.length));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", c.a(0L, this.f9503f));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", c.a(0L, this.f9503f));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", c.a(0L, this.f9503f));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", c.a(0L, this.f9503f));
        }
    }

    public final String b(String str) {
        c c10 = c(str);
        if (c10 != null) {
            if (!L.contains(str)) {
                return c10.f(this.f9503f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i7 = c10.f9458a;
                if (i7 != 5 && i7 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i7);
                    return null;
                }
                e[] eVarArr = (e[]) c10.g(this.f9503f);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer valueOf = Integer.valueOf((int) (((float) eVar.f9466a) / ((float) eVar.f9467b)));
                e eVar2 = eVarArr[1];
                Integer valueOf2 = Integer.valueOf((int) (((float) eVar2.f9466a) / ((float) eVar2.f9467b)));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) eVar3.f9466a) / ((float) eVar3.f9467b))));
            }
            try {
                return Double.toString(c10.d(this.f9503f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f9483l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i7 = 0; i7 < f9475H.length; i7++) {
            c cVar = (c) this.f9501d[i7].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void d(f fVar) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                i.a(mediaMetadataRetriever, new a(fVar));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str2 = mediaMetadataRetriever.extractMetadata(30);
                    str3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str2 = mediaMetadataRetriever.extractMetadata(19);
                    str3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                HashMap[] hashMapArr = this.f9501d;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", c.c(Integer.parseInt(str), this.f9503f));
                }
                if (str2 != null) {
                    hashMapArr[0].put("ImageLength", c.c(Integer.parseInt(str2), this.f9503f));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    hashMapArr[0].put("Orientation", c.c(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f9503f));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.n(parseInt2);
                    byte[] bArr = new byte[6];
                    if (fVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i7 = parseInt2 + 6;
                    int i10 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f9481O)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i10];
                    if (fVar.read(bArr2) != i10) {
                        throw new IOException("Can't read exif");
                    }
                    this.f9504h = i7;
                    r(0, bArr2);
                }
                if (f9483l) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a2, code lost:
    
        r23.f9455b = r22.f9503f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a6, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00a7. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(b bVar, int i7, int i10) {
        boolean z8 = f9483l;
        if (z8) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + bVar);
        }
        bVar.f9455b = ByteOrder.BIG_ENDIAN;
        byte readByte = bVar.readByte();
        byte b2 = -1;
        if (readByte != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        int i11 = 2;
        int i12 = 2;
        while (true) {
            byte readByte2 = bVar.readByte();
            if (readByte2 != b2) {
                throw new IOException("Invalid marker:" + Integer.toHexString(readByte2 & 255));
            }
            byte readByte3 = bVar.readByte();
            if (z8) {
                Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
            }
            if (readByte3 != -39 && readByte3 != -38) {
                int readUnsignedShort = bVar.readUnsignedShort();
                int i13 = readUnsignedShort - 2;
                int i14 = i12 + 4;
                if (z8) {
                    Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + ")");
                }
                if (i13 < 0) {
                    throw new IOException("Invalid length");
                }
                HashMap[] hashMapArr = this.f9501d;
                int i15 = 0;
                if (readByte3 == -31) {
                    byte[] bArr = new byte[i13];
                    bVar.readFully(bArr);
                    int i16 = i14 + i13;
                    byte[] bArr2 = f9481O;
                    if (bArr2 != null && i13 >= bArr2.length) {
                        int i17 = 0;
                        while (i17 < bArr2.length) {
                            if (bArr[i17] == bArr2[i17]) {
                                i17++;
                                i15 = 0;
                            }
                        }
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr2.length, i13);
                        this.f9504h = i7 + i14 + bArr2.length;
                        r(i10, copyOfRange);
                        u(new b(copyOfRange));
                        i14 = i16;
                        i13 = 0;
                    }
                    byte[] bArr3 = f9482P;
                    if (bArr3 != null && i13 >= bArr3.length) {
                        int i18 = i15;
                        while (true) {
                            if (i18 >= bArr3.length) {
                                int length = i14 + bArr3.length;
                                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr3.length, i13);
                                if (b("Xmp") == null) {
                                    hashMapArr[i15].put("Xmp", new c(length, copyOfRange2, 1, copyOfRange2.length));
                                }
                            } else if (bArr[i18] == bArr3[i18]) {
                                i18++;
                            }
                        }
                    }
                    i14 = i16;
                    i13 = 0;
                } else if (readByte3 != -2) {
                    switch (readByte3) {
                        case -64:
                        case -63:
                        case -62:
                        case -61:
                            break;
                        default:
                            switch (readByte3) {
                                case -59:
                                case -58:
                                case -57:
                                    break;
                                default:
                                    switch (readByte3) {
                                        case -55:
                                        case -54:
                                        case -53:
                                            break;
                                        default:
                                            switch (readByte3) {
                                            }
                                    }
                            }
                    }
                    bVar.l(1);
                    hashMapArr[i10].put(i10 != 4 ? "ImageLength" : "ThumbnailImageLength", c.a(bVar.readUnsignedShort(), this.f9503f));
                    hashMapArr[i10].put(i10 != 4 ? "ImageWidth" : "ThumbnailImageWidth", c.a(bVar.readUnsignedShort(), this.f9503f));
                    i13 = readUnsignedShort - 7;
                } else {
                    byte[] bArr4 = new byte[i13];
                    if (bVar.read(bArr4) != i13) {
                        throw new IOException("Invalid exif");
                    }
                    if (b("UserComment") == null) {
                        HashMap hashMap = hashMapArr[1];
                        Charset charset = f9480N;
                        byte[] bytes = new String(bArr4, charset).concat("\u0000").getBytes(charset);
                        hashMap.put("UserComment", new c(i11, bytes, bytes.length));
                    }
                    i13 = 0;
                }
                if (i13 < 0) {
                    throw new IOException("Invalid length");
                }
                bVar.l(i13);
                i12 = i14 + i13;
                i11 = 2;
                b2 = -1;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x00bf, code lost:
    
        if (r8 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0155, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0132  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(BufferedInputStream bufferedInputStream) {
        InputStream inputStream;
        b bVar;
        b bVar2;
        b bVar3;
        boolean z8;
        b bVar4;
        b bVar5;
        boolean z10;
        boolean z11;
        boolean z12;
        b bVar6;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i7 = 0;
        while (true) {
            byte[] bArr2 = f9488q;
            if (i7 >= bArr2.length) {
                return 4;
            }
            if (bArr[i7] != bArr2[i7]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i10 = 0; i10 < bytes.length; i10++) {
                    byte b2 = bArr[i10];
                    ?? r82 = bytes[i10];
                    try {
                        if (b2 != r82) {
                            try {
                                bVar = new b(bArr);
                                try {
                                    long readInt = bVar.readInt();
                                    byte[] bArr3 = new byte[4];
                                    bVar.read(bArr3);
                                    if (Arrays.equals(bArr3, f9489r)) {
                                        if (readInt == 1) {
                                            readInt = bVar.readLong();
                                            j = 16;
                                            if (readInt < 16) {
                                            }
                                        } else {
                                            j = 8;
                                        }
                                        long j10 = 5000;
                                        if (readInt > j10) {
                                            readInt = j10;
                                        }
                                        long j11 = readInt - j;
                                        if (j11 >= 8) {
                                            byte[] bArr4 = new byte[4];
                                            boolean z13 = false;
                                            boolean z14 = false;
                                            for (long j12 = 0; j12 < j11 / 4 && bVar.read(bArr4) == 4; j12++) {
                                                if (j12 != 1) {
                                                    if (Arrays.equals(bArr4, f9490s)) {
                                                        z13 = true;
                                                    } else if (Arrays.equals(bArr4, f9491t)) {
                                                        z14 = true;
                                                    }
                                                    if (z13 && z14) {
                                                        bVar.close();
                                                        return 12;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    if (f9483l) {
                                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                    }
                                }
                            } catch (Exception e10) {
                                e = e10;
                                bVar = null;
                            } catch (Throwable th) {
                                th = th;
                                inputStream = null;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                            bVar.close();
                            try {
                                bVar3 = new b(bArr);
                                try {
                                    ByteOrder q10 = q(bVar3);
                                    this.f9503f = q10;
                                    bVar3.f9455b = q10;
                                    short readShort = bVar3.readShort();
                                    z8 = readShort == 20306 || readShort == 21330;
                                    bVar3.close();
                                } catch (Exception unused) {
                                    if (bVar3 != null) {
                                        bVar3.close();
                                    }
                                    z8 = false;
                                    if (!z8) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    bVar2 = bVar3;
                                    if (bVar2 != null) {
                                        bVar2.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused2) {
                                bVar3 = null;
                            } catch (Throwable th3) {
                                th = th3;
                                bVar2 = null;
                            }
                            if (!z8) {
                                return 7;
                            }
                            try {
                                bVar6 = new b(bArr);
                            } catch (Exception unused3) {
                                bVar5 = null;
                            } catch (Throwable th4) {
                                th = th4;
                                bVar4 = null;
                            }
                            try {
                                ByteOrder q11 = q(bVar6);
                                this.f9503f = q11;
                                bVar6.f9455b = q11;
                                z10 = bVar6.readShort() == 85;
                                bVar6.close();
                            } catch (Exception unused4) {
                                bVar5 = bVar6;
                                if (bVar5 != null) {
                                    bVar5.close();
                                }
                                z10 = false;
                                if (!z10) {
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                bVar4 = bVar6;
                                if (bVar4 != null) {
                                    bVar4.close();
                                }
                                throw th;
                            }
                            if (!z10) {
                                return 10;
                            }
                            int i11 = 0;
                            while (true) {
                                byte[] bArr5 = f9494w;
                                if (i11 >= bArr5.length) {
                                    z11 = true;
                                    break;
                                }
                                if (bArr[i11] != bArr5[i11]) {
                                    z11 = false;
                                    break;
                                }
                                i11++;
                            }
                            if (z11) {
                                return 13;
                            }
                            int i12 = 0;
                            while (true) {
                                byte[] bArr6 = f9468A;
                                if (i12 >= bArr6.length) {
                                    int i13 = 0;
                                    while (true) {
                                        byte[] bArr7 = f9469B;
                                        if (i13 >= bArr7.length) {
                                            z12 = true;
                                            break;
                                        }
                                        if (bArr[bArr6.length + i13 + 4] != bArr7[i13]) {
                                            break;
                                        }
                                        i13++;
                                    }
                                } else {
                                    if (bArr[i12] != bArr6[i12]) {
                                        break;
                                    }
                                    i12++;
                                }
                            }
                            return z12 ? 14 : 0;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        inputStream = r82;
                    }
                }
                return 9;
            }
            i7++;
        }
    }

    public final void g(f fVar) {
        int i7;
        int i10;
        j(fVar);
        HashMap[] hashMapArr = this.f9501d;
        c cVar = (c) hashMapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f9461d);
            fVar2.f9455b = this.f9503f;
            byte[] bArr = f9492u;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.n(0L);
            byte[] bArr3 = f9493v;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.n(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.n(12L);
            }
            s(fVar2, 6);
            c cVar2 = (c) hashMapArr[7].get("PreviewImageStart");
            c cVar3 = (c) hashMapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", cVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) hashMapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.g(this.f9503f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i11 = iArr[2];
                int i12 = iArr[0];
                if (i11 <= i12 || (i7 = iArr[3]) <= (i10 = iArr[1])) {
                    return;
                }
                int i13 = (i11 - i12) + 1;
                int i14 = (i7 - i10) + 1;
                if (i13 < i14) {
                    int i15 = i13 + i14;
                    i14 = i15 - i14;
                    i13 = i15 - i14;
                }
                c c10 = c.c(i13, this.f9503f);
                c c11 = c.c(i14, this.f9503f);
                hashMapArr[0].put("ImageWidth", c10);
                hashMapArr[0].put("ImageLength", c11);
            }
        }
    }

    public final void h(b bVar) {
        if (f9483l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f9455b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f9494w;
        bVar.l(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i7 = length + 8;
                if (i7 == 16 && !Arrays.equals(bArr2, f9496y)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f9497z)) {
                    return;
                }
                if (Arrays.equals(bArr2, f9495x)) {
                    byte[] bArr3 = new byte[readInt];
                    if (bVar.read(bArr3) != readInt) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + vc.i.f(bArr2));
                    }
                    int readInt2 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f9504h = i7;
                        r(0, bArr3);
                        x();
                        u(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i10 = readInt + 4;
                bVar.l(i10);
                length = i7 + i10;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(b bVar) {
        boolean z8 = f9483l;
        if (z8) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.l(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i7 = ByteBuffer.wrap(bArr).getInt();
        int i10 = ByteBuffer.wrap(bArr2).getInt();
        int i11 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i10];
        bVar.l(i7 - bVar.f9456c);
        bVar.read(bArr4);
        e(new b(bArr4), i7, 5);
        bVar.l(i11 - bVar.f9456c);
        bVar.f9455b = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (z8) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i12 = 0; i12 < readInt; i12++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f9474G.f9462a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c c10 = c.c(readShort, this.f9503f);
                c c11 = c.c(readShort2, this.f9503f);
                HashMap[] hashMapArr = this.f9501d;
                hashMapArr[0].put("ImageLength", c10);
                hashMapArr[0].put("ImageWidth", c11);
                if (z8) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.l(readUnsignedShort2);
        }
    }

    public final void j(f fVar) {
        o(fVar);
        s(fVar, 0);
        w(fVar, 0);
        w(fVar, 5);
        w(fVar, 4);
        x();
        if (this.f9500c == 8) {
            HashMap[] hashMapArr = this.f9501d;
            c cVar = (c) hashMapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f9461d);
                fVar2.f9455b = this.f9503f;
                fVar2.l(6);
                s(fVar2, 9);
                c cVar2 = (c) hashMapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    hashMapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void k(f fVar) {
        if (f9483l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        j(fVar);
        HashMap[] hashMapArr = this.f9501d;
        c cVar = (c) hashMapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            e(new b(cVar.f9461d), (int) cVar.f9460c, 5);
        }
        c cVar2 = (c) hashMapArr[0].get("ISO");
        c cVar3 = (c) hashMapArr[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", cVar2);
    }

    public final void l(b bVar) {
        if (f9483l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f9455b = ByteOrder.LITTLE_ENDIAN;
        bVar.l(f9468A.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f9469B;
        bVar.l(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int readInt2 = bVar.readInt();
                int i7 = length + 8;
                if (Arrays.equals(f9470C, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    if (bVar.read(bArr3) == readInt2) {
                        this.f9504h = i7;
                        r(0, bArr3);
                        u(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + vc.i.f(bArr2));
                    }
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i7 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.l(readInt2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int e2 = cVar.e(this.f9503f);
        int e10 = cVar2.e(this.f9503f);
        if (this.f9500c == 7) {
            e2 += this.f9505i;
        }
        if (e2 > 0 && e10 > 0 && this.f9499b == null && this.f9498a == null) {
            bVar.skip(e2);
            bVar.read(new byte[e10]);
        }
        if (f9483l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e2 + ", length: " + e10);
        }
    }

    public final boolean n(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.e(this.f9503f) <= 512 && cVar2.e(this.f9503f) <= 512;
    }

    public final void o(f fVar) {
        ByteOrder q10 = q(fVar);
        this.f9503f = q10;
        fVar.f9455b = q10;
        int readUnsignedShort = fVar.readUnsignedShort();
        int i7 = this.f9500c;
        if (i7 != 7 && i7 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = fVar.readInt();
        if (readInt < 8) {
            throw new IOException(o.l(readInt, "Invalid first Ifd offset: "));
        }
        int i10 = readInt - 8;
        if (i10 > 0) {
            fVar.l(i10);
        }
    }

    public final void p() {
        int i7 = 0;
        while (true) {
            HashMap[] hashMapArr = this.f9501d;
            if (i7 >= hashMapArr.length) {
                return;
            }
            StringBuilder r10 = o.r(i7, "The size of tag group[", "]: ");
            r10.append(hashMapArr[i7].size());
            Log.d("ExifInterface", r10.toString());
            for (Map.Entry entry : hashMapArr[i7].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.f(this.f9503f) + "'");
            }
            i7++;
        }
    }

    public final void r(int i7, byte[] bArr) {
        f fVar = new f(bArr);
        o(fVar);
        s(fVar, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0281  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(f fVar, int i7) {
        HashMap[] hashMapArr;
        short s3;
        HashSet hashSet;
        short s10;
        HashMap[] hashMapArr2;
        long j;
        boolean z8;
        int i10;
        long j10;
        int i11;
        int i12;
        HashSet hashSet2;
        int readUnsignedShort;
        long j11;
        Integer valueOf = Integer.valueOf(fVar.f9456c);
        HashSet hashSet3 = this.f9502e;
        hashSet3.add(valueOf);
        short readShort = fVar.readShort();
        boolean z10 = f9483l;
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) readShort));
        }
        if (readShort <= 0) {
            return;
        }
        short s11 = 0;
        while (true) {
            hashMapArr = this.f9501d;
            if (s11 >= readShort) {
                break;
            }
            int readUnsignedShort2 = fVar.readUnsignedShort();
            int readUnsignedShort3 = fVar.readUnsignedShort();
            int readInt = fVar.readInt();
            long j12 = fVar.f9456c + 4;
            d dVar = (d) f9477J[i7].get(Integer.valueOf(readUnsignedShort2));
            if (z10) {
                s3 = readShort;
                s10 = s11;
                hashSet = hashSet3;
                hashMapArr2 = hashMapArr;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i7), Integer.valueOf(readUnsignedShort2), dVar != null ? dVar.f9463b : null, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt)));
            } else {
                s3 = readShort;
                hashSet = hashSet3;
                s10 = s11;
                hashMapArr2 = hashMapArr;
            }
            if (dVar != null) {
                if (readUnsignedShort3 > 0) {
                    if (readUnsignedShort3 < f9472E.length) {
                        int i13 = dVar.f9464c;
                        if (i13 == 7 || readUnsignedShort3 == 7 || i13 == readUnsignedShort3 || (i10 = dVar.f9465d) == readUnsignedShort3 || (((i13 == 4 || i10 == 4) && readUnsignedShort3 == 3) || (((i13 == 9 || i10 == 9) && readUnsignedShort3 == 8) || ((i13 == 12 || i10 == 12) && readUnsignedShort3 == 11)))) {
                            if (readUnsignedShort3 == 7) {
                                readUnsignedShort3 = i13;
                            }
                            j = r4[readUnsignedShort3] * readInt;
                            if (j < 0 || j > 2147483647L) {
                                if (z10) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + readInt);
                                }
                                z8 = false;
                                if (z8) {
                                    if (j > 4) {
                                        int readInt2 = fVar.readInt();
                                        if (z10) {
                                            j10 = j12;
                                            Log.d("ExifInterface", "seek to data offset: " + readInt2);
                                        } else {
                                            j10 = j12;
                                        }
                                        if (this.f9500c == 7) {
                                            if ("MakerNote".equals(dVar.f9463b)) {
                                                this.f9505i = readInt2;
                                            } else if (i7 == 6 && "ThumbnailImage".equals(dVar.f9463b)) {
                                                this.j = readInt2;
                                                this.k = readInt;
                                                c c10 = c.c(6, this.f9503f);
                                                i12 = readInt;
                                                c a9 = c.a(this.j, this.f9503f);
                                                i11 = readUnsignedShort3;
                                                c a10 = c.a(this.k, this.f9503f);
                                                hashMapArr2[4].put("Compression", c10);
                                                hashMapArr2[4].put("JPEGInterchangeFormat", a9);
                                                hashMapArr2[4].put("JPEGInterchangeFormatLength", a10);
                                                fVar.n(readInt2);
                                            }
                                        }
                                        i11 = readUnsignedShort3;
                                        i12 = readInt;
                                        fVar.n(readInt2);
                                    } else {
                                        j10 = j12;
                                        i11 = readUnsignedShort3;
                                        i12 = readInt;
                                    }
                                    Integer num = (Integer) f9479M.get(Integer.valueOf(readUnsignedShort2));
                                    if (z10) {
                                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j);
                                    }
                                    if (num != null) {
                                        int i14 = i11;
                                        if (i14 != 3) {
                                            if (i14 == 4) {
                                                j11 = fVar.readInt() & 4294967295L;
                                            } else if (i14 == 8) {
                                                readUnsignedShort = fVar.readShort();
                                            } else if (i14 == 9 || i14 == 13) {
                                                readUnsignedShort = fVar.readInt();
                                            } else {
                                                j11 = -1;
                                            }
                                            if (z10) {
                                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j11), dVar.f9463b));
                                            }
                                            if (j11 <= 0) {
                                                hashSet2 = hashSet;
                                                if (!hashSet2.contains(Integer.valueOf((int) j11))) {
                                                    fVar.n(j11);
                                                    s(fVar, num.intValue());
                                                } else if (z10) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j11 + ")");
                                                }
                                            } else {
                                                hashSet2 = hashSet;
                                                if (z10) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j11);
                                                }
                                            }
                                            fVar.n(j10);
                                        } else {
                                            readUnsignedShort = fVar.readUnsignedShort();
                                        }
                                        j11 = readUnsignedShort;
                                        if (z10) {
                                        }
                                        if (j11 <= 0) {
                                        }
                                        fVar.n(j10);
                                    } else {
                                        hashSet2 = hashSet;
                                        long j13 = j10;
                                        int i15 = fVar.f9456c + this.f9504h;
                                        byte[] bArr = new byte[(int) j];
                                        fVar.readFully(bArr);
                                        c cVar = new c(i15, bArr, i11, i12);
                                        hashMapArr2[i7].put(dVar.f9463b, cVar);
                                        String str = dVar.f9463b;
                                        if ("DNGVersion".equals(str)) {
                                            this.f9500c = 3;
                                        }
                                        if ((("Make".equals(str) || "Model".equals(str)) && cVar.f(this.f9503f).contains("PENTAX")) || ("Compression".equals(str) && cVar.e(this.f9503f) == 65535)) {
                                            this.f9500c = 8;
                                        }
                                        if (fVar.f9456c != j13) {
                                            fVar.n(j13);
                                        }
                                    }
                                } else {
                                    fVar.n(j12);
                                    hashSet2 = hashSet;
                                }
                                s11 = (short) (s10 + 1);
                                hashSet3 = hashSet2;
                                readShort = s3;
                            } else {
                                z8 = true;
                                if (z8) {
                                }
                                s11 = (short) (s10 + 1);
                                hashSet3 = hashSet2;
                                readShort = s3;
                            }
                        } else if (z10) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f9471D[readUnsignedShort3] + ") is unexpected for tag: " + dVar.f9463b);
                        }
                    }
                }
                if (z10) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                }
            } else if (z10) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
            }
            j = 0;
            z8 = false;
            if (z8) {
            }
            s11 = (short) (s10 + 1);
            hashSet3 = hashSet2;
            readShort = s3;
        }
        HashSet hashSet4 = hashSet3;
        int readInt3 = fVar.readInt();
        if (z10) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
        }
        long j14 = readInt3;
        if (j14 <= 0) {
            if (z10) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        if (hashSet4.contains(Integer.valueOf(readInt3))) {
            if (z10) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        fVar.n(j14);
        if (hashMapArr[4].isEmpty()) {
            s(fVar, 4);
        } else if (hashMapArr[5].isEmpty()) {
            s(fVar, 5);
        }
    }

    public final void t(int i7, String str, String str2) {
        HashMap[] hashMapArr = this.f9501d;
        if (hashMapArr[i7].isEmpty() || hashMapArr[i7].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i7];
        hashMap.put(str2, hashMap.get(str));
        hashMapArr[i7].remove(str);
    }

    public final void u(b bVar) {
        c cVar;
        int e2;
        HashMap hashMap = this.f9501d[4];
        c cVar2 = (c) hashMap.get("Compression");
        if (cVar2 == null) {
            m(bVar, hashMap);
            return;
        }
        int e10 = cVar2.e(this.f9503f);
        if (e10 != 1) {
            if (e10 == 6) {
                m(bVar, hashMap);
                return;
            } else if (e10 != 7) {
                return;
            }
        }
        c cVar3 = (c) hashMap.get("BitsPerSample");
        if (cVar3 != null) {
            int[] iArr = (int[]) cVar3.g(this.f9503f);
            int[] iArr2 = f9486o;
            if (Arrays.equals(iArr2, iArr) || (this.f9500c == 3 && (cVar = (c) hashMap.get("PhotometricInterpretation")) != null && (((e2 = cVar.e(this.f9503f)) == 1 && Arrays.equals(iArr, f9487p)) || (e2 == 6 && Arrays.equals(iArr, iArr2))))) {
                c cVar4 = (c) hashMap.get("StripOffsets");
                c cVar5 = (c) hashMap.get("StripByteCounts");
                if (cVar4 == null || cVar5 == null) {
                    return;
                }
                long[] h10 = vc.i.h(cVar4.g(this.f9503f));
                long[] h11 = vc.i.h(cVar5.g(this.f9503f));
                if (h10 == null || h10.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (h11 == null || h11.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (h10.length != h11.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j10 : h11) {
                    j += j10;
                }
                byte[] bArr = new byte[(int) j];
                this.g = true;
                int i7 = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < h10.length; i11++) {
                    int i12 = (int) h10[i11];
                    int i13 = (int) h11[i11];
                    if (i11 < h10.length - 1 && i12 + i13 != h10[i11 + 1]) {
                        this.g = false;
                    }
                    int i14 = i12 - i7;
                    if (i14 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j11 = i14;
                    if (bVar.skip(j11) != j11) {
                        Log.d("ExifInterface", "Failed to skip " + i14 + " bytes.");
                        return;
                    }
                    int i15 = i7 + i14;
                    byte[] bArr2 = new byte[i13];
                    if (bVar.read(bArr2) != i13) {
                        Log.d("ExifInterface", "Failed to read " + i13 + " bytes.");
                        return;
                    }
                    i7 = i15 + i13;
                    System.arraycopy(bArr2, 0, bArr, i10, i13);
                    i10 += i13;
                }
                if (this.g) {
                    long j12 = h10[0];
                    return;
                }
                return;
            }
        }
        if (f9483l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i7, int i10) {
        HashMap[] hashMapArr = this.f9501d;
        boolean isEmpty = hashMapArr[i7].isEmpty();
        boolean z8 = f9483l;
        if (isEmpty || hashMapArr[i10].isEmpty()) {
            if (z8) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) hashMapArr[i7].get("ImageLength");
        c cVar2 = (c) hashMapArr[i7].get("ImageWidth");
        c cVar3 = (c) hashMapArr[i10].get("ImageLength");
        c cVar4 = (c) hashMapArr[i10].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (z8) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (z8) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int e2 = cVar.e(this.f9503f);
        int e10 = cVar2.e(this.f9503f);
        int e11 = cVar3.e(this.f9503f);
        int e12 = cVar4.e(this.f9503f);
        if (e2 >= e11 || e10 >= e12) {
            return;
        }
        HashMap hashMap = hashMapArr[i7];
        hashMapArr[i7] = hashMapArr[i10];
        hashMapArr[i10] = hashMap;
    }

    public final void w(f fVar, int i7) {
        c c10;
        c c11;
        HashMap[] hashMapArr = this.f9501d;
        c cVar = (c) hashMapArr[i7].get("DefaultCropSize");
        c cVar2 = (c) hashMapArr[i7].get("SensorTopBorder");
        c cVar3 = (c) hashMapArr[i7].get("SensorLeftBorder");
        c cVar4 = (c) hashMapArr[i7].get("SensorBottomBorder");
        c cVar5 = (c) hashMapArr[i7].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f9458a == 5) {
                e[] eVarArr = (e[]) cVar.g(this.f9503f);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
                c10 = c.b(eVarArr[0], this.f9503f);
                c11 = c.b(eVarArr[1], this.f9503f);
            } else {
                int[] iArr = (int[]) cVar.g(this.f9503f);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c10 = c.c(iArr[0], this.f9503f);
                c11 = c.c(iArr[1], this.f9503f);
            }
            hashMapArr[i7].put("ImageWidth", c10);
            hashMapArr[i7].put("ImageLength", c11);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int e2 = cVar2.e(this.f9503f);
            int e10 = cVar4.e(this.f9503f);
            int e11 = cVar5.e(this.f9503f);
            int e12 = cVar3.e(this.f9503f);
            if (e10 <= e2 || e11 <= e12) {
                return;
            }
            c c12 = c.c(e10 - e2, this.f9503f);
            c c13 = c.c(e11 - e12, this.f9503f);
            hashMapArr[i7].put("ImageLength", c12);
            hashMapArr[i7].put("ImageWidth", c13);
            return;
        }
        c cVar6 = (c) hashMapArr[i7].get("ImageLength");
        c cVar7 = (c) hashMapArr[i7].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = (c) hashMapArr[i7].get("JPEGInterchangeFormat");
            c cVar9 = (c) hashMapArr[i7].get("JPEGInterchangeFormatLength");
            if (cVar8 == null || cVar9 == null) {
                return;
            }
            int e13 = cVar8.e(this.f9503f);
            int e14 = cVar8.e(this.f9503f);
            fVar.n(e13);
            byte[] bArr = new byte[e14];
            fVar.read(bArr);
            e(new b(bArr), e13, i7);
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] hashMapArr = this.f9501d;
        c cVar = (c) hashMapArr[1].get("PixelXDimension");
        c cVar2 = (c) hashMapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            hashMapArr[0].put("ImageWidth", cVar);
            hashMapArr[0].put("ImageLength", cVar2);
        }
        if (hashMapArr[4].isEmpty() && n(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!n(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t(0, "ThumbnailOrientation", "Orientation");
        t(0, "ThumbnailImageLength", "ImageLength");
        t(0, "ThumbnailImageWidth", "ImageWidth");
        t(5, "ThumbnailOrientation", "Orientation");
        t(5, "ThumbnailImageLength", "ImageLength");
        t(5, "ThumbnailImageWidth", "ImageWidth");
        t(4, "Orientation", "ThumbnailOrientation");
        t(4, "ImageLength", "ThumbnailImageLength");
        t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
