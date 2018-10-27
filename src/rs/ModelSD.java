/* ModelSD - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.cache.anim.AnimFrame;
import com.jagex.cache.anim.AnimFrameBase;
import com.jagex.cache.loaders.AnimFrameLoader;

public class ModelSD extends SceneGraphNode_AbstractModelRenderer {
	public short minY;
	public int anInt4955 = 0;
	public int[] triangleVertexB;
	public int[] anIntArray4957;
	public int[] vertexY;
	public int[][] anIntArrayArray4959;
	public int[] anIntArray4960;
	public int[][] anIntArrayArray4961;
	public int[] vertexX;
	public short boundingPlaneRadius;
	public int[] anIntArray4964;
	public int[] triangleInfo;
	public int anInt4966;
	public short maxX;
	public int[] triangleVertexA;
	public int[] vertexZ;
	public short maxZ;
	public byte[] aByteArray4971;
	public int[] triangleVertexC;
	public byte[] aByteArray4973;
	public boolean boundsCalculated = false;
	public static ModelSD aClass133_Sub7_Sub1_4975 = new ModelSD();
	public short boundingSphereRadius;
	public short minX;
	public int[] anIntArray4978;
	public short maxY;
	public short minZ;
	public int[] anIntArray4981;
	public int triangleCount;
	public byte[] aByteArray4983;
	public short[] aShortArray4984;
	public static ModelSD aClass133_Sub7_Sub1_4985;
	public static byte[] aByteArray4986 = new byte[1];
	public static int[] projectSceneZ;
	public static boolean[] aBooleanArray4988;
	public static int[] depthTriangles;
	public static int[] anIntArray4990;
	public static byte[] aByteArray4991;
	public static int[] vertexScreenX;
	public static int[] projectSceneX;
	public static int[] vertexDepth;
	public static int anInt4995;
	public static int[] anIntArray4996;
	public static int[] projectSceneY;
	public static int anInt4998;
	public static int[][] anIntArrayArray4999;
	public static int[] anIntArray5000;
	public static int[] anIntArray5001;
	public static boolean[] aBooleanArray5002;
	public static int anInt5003;
	public static int[] anIntArray5004;
	public static int[] anIntArray5005;
	public static int[] vertexScreenY;
	public static int[] anIntArray5007;
	public static int[] anIntArray5008;

	static {
		aClass133_Sub7_Sub1_4985 = new ModelSD();
		projectSceneX = new int[4096];
		aBooleanArray4988 = new boolean[4096];
		vertexScreenX = new int[4096];
		aByteArray4991 = new byte[1];
		projectSceneZ = new int[4096];
		vertexDepth = new int[4096];
		aBooleanArray5002 = new boolean[4096];
		anIntArray5005 = new int[4096];
		depthTriangles = new int[4096];
		anIntArray5004 = new int[10];
		anIntArray5000 = new int[4096];
		vertexScreenY = new int[4096];
		anIntArrayArray4999 = new int[12][4096];
		anIntArray5007 = new int[4096];
		anIntArray5008 = new int[10];
		anIntArray4990 = new int[12];
		anIntArray5001 = new int[12];
		projectSceneY = new int[4096];
		anIntArray4996 = new int[10];
	}

	@Override
	public SceneGraphNode_AbstractModelRenderer method1870(boolean bool, boolean bool_0_) {
		if (!bool && aByteArray4991.length < triangleCount)
			aByteArray4991 = new byte[triangleCount + 100];
		return method1886(bool, aClass133_Sub7_Sub1_4985, aByteArray4991);
	}

	@Override
	public int method1867() {
		if (!boundsCalculated)
			calculateBounds();
		return minX;
	}

	public void calculateBounds() {
		int minX = 32767;
		int minY = 32767;
		int minZ = 32767;
		int maxX = -32768;
		int maxY = -32768;
		int maxZ = -32768;
		int boundingPlaneRadius = 0;
		int boundingSphereRadius = 0;
		for (int i_8_ = 0; i_8_ < anInt4955; i_8_++) {
			int xVertex = vertexX[i_8_];
			int yVertex = vertexY[i_8_];
			int zVertex = vertexZ[i_8_];
			if (xVertex < minX)
				minX = xVertex;
			if (xVertex > maxX)
				maxX = xVertex;
			if (yVertex < minY)
				minY = yVertex;
			if (yVertex > maxY)
				maxY = yVertex;
			if (zVertex < minZ)
				minZ = zVertex;
			if (zVertex > maxZ)
				maxZ = zVertex;
			int radius = xVertex * xVertex + zVertex * zVertex;
			if (radius > boundingPlaneRadius)
				boundingPlaneRadius = radius;
			radius += yVertex * yVertex;
			if (radius > boundingSphereRadius)
				boundingSphereRadius = radius;
		}
		this.minX = (short) minX;
		this.maxX = (short) maxX;
		this.minY = (short) minY;
		this.maxY = (short) maxY;
		this.minZ = (short) minZ;
		this.maxZ = (short) maxZ;
		this.boundingPlaneRadius = (short) (int) (Math.sqrt(boundingPlaneRadius) + 0.99);
		this.boundingSphereRadius = (short) (int) (Math.sqrt(boundingSphereRadius) + 0.99);
		boundsCalculated = true;
	}

	@Override
	public void method1873(AnimFrameLoader class14_sub2_sub15, int i, AnimFrameLoader class14_sub2_sub15_13_,
			int i_14_, int[] is, boolean bool) {
		if (i != -1) {
			if (is == null || i_14_ == -1)
				method1857(class14_sub2_sub15, i, bool);
			else {
				AnimFrame animframe = class14_sub2_sub15.aClass143Array3951[i];
				AnimFrame animframe_15_ = class14_sub2_sub15_13_.aClass143Array3951[i_14_];
				AnimFrameBase animframebase = animframe.base;
				anInt5003 = 0;
				anInt4998 = 0;
				anInt4995 = 0;
				int i_16_ = 0;
				int i_17_ = is[i_16_++];
				for (int i_18_ = 0; i_18_ < animframe.transformationCount; i_18_++) {
					int i_19_;
					for (i_19_ = animframe.transformationIndices[i_18_]; i_19_ > i_17_; i_17_ = is[i_16_++]) {
						/* empty */
					}
					if (i_19_ != i_17_ || animframebase.transformationType[i_19_] == 0) {
						if (animframe.aShortArray2338[i_18_] != -1)
							method1885(0, (animframebase.labels[animframe.aShortArray2338[i_18_]]), 0, 0, 0);
						method1885(animframebase.transformationType[i_19_], animframebase.labels[i_19_],
								animframe.transformX[i_18_], animframe.transformY[i_18_],
								animframe.transformZ[i_18_]);
					}
				}
				anInt5003 = 0;
				anInt4998 = 0;
				anInt4995 = 0;
				i_16_ = 0;
				i_17_ = is[i_16_++];
				for (int i_20_ = 0; i_20_ < animframe_15_.transformationCount; i_20_++) {
					int i_21_;
					for (i_21_ = animframe_15_.transformationIndices[i_20_]; i_21_ > i_17_; i_17_ = is[i_16_++]) {
						/* empty */
					}
					if (i_21_ == i_17_ || animframebase.transformationType[i_21_] == 0) {
						if (animframe_15_.aShortArray2338[i_20_] != -1)
							method1885(0, animframebase.labels[(animframe_15_.aShortArray2338[i_20_])], 0, 0, 0);
						method1885(animframebase.transformationType[i_21_], animframebase.labels[i_21_],
								animframe_15_.transformX[i_20_], animframe_15_.transformY[i_20_],
								animframe_15_.transformZ[i_20_]);
					}
				}
				boundsCalculated = false;
			}
		}
	}

	@Override
	public void draw(int pitch, int yaw, int roll, int cameraPitch, int cameraX, int cameraY, int cameraZ) {
		if (!boundsCalculated)
			calculateBounds();
		int i_28_ = SDRaster.anInt118;
		int i_29_ = SDRaster.anInt110;
		int i_30_ = SDRaster.sin[pitch];
		int i_31_ = SDRaster.cos[pitch];
		int i_32_ = SDRaster.sin[yaw];
		int i_33_ = SDRaster.cos[yaw];
		int i_34_ = SDRaster.sin[roll];
		int i_35_ = SDRaster.cos[roll];
		int i_36_ = SDRaster.sin[cameraPitch];
		int i_37_ = SDRaster.cos[cameraPitch];
		int i_38_ = cameraY * i_36_ + cameraZ * i_37_ >> 16;
		for (int i_39_ = 0; i_39_ < anInt4955; i_39_++) {
			int x = vertexX[i_39_];
			int y = vertexY[i_39_];
			int z = vertexZ[i_39_];
			if (roll != 0) {
				int i_43_ = y * i_34_ + x * i_35_ >> 16;
				y = y * i_35_ - x * i_34_ >> 16;
				x = i_43_;
			}
			if (pitch != 0) {
				int i_44_ = y * i_31_ - z * i_30_ >> 16;
				z = y * i_30_ + z * i_31_ >> 16;
				y = i_44_;
			}
			if (yaw != 0) {
				int i_45_ = z * i_32_ + x * i_33_ >> 16;
				z = z * i_33_ - x * i_32_ >> 16;
				x = i_45_;
			}
			x += cameraX;
			y += cameraY;
			z += cameraZ;
			int i_46_ = y * i_37_ - z * i_36_ >> 16;
			z = y * i_36_ + z * i_37_ >> 16;
			y = i_46_;
			vertexDepth[i_39_] = z - i_38_;
			vertexScreenY[i_39_] = i_28_ + (x << 9) / z;
			vertexScreenX[i_39_] = i_29_ + (y << 9) / z;
			if (anInt4966 > 0) {
				projectSceneX[i_39_] = x;
				projectSceneY[i_39_] = y;
				projectSceneZ[i_39_] = z;
			}
		}
		draw(false, false, 0L, boundingSphereRadius, boundingSphereRadius << 1);
	}

	public static void method1877() {
		aClass133_Sub7_Sub1_4975 = null;
		aByteArray4986 = null;
		aClass133_Sub7_Sub1_4985 = null;
		aByteArray4991 = null;
		aBooleanArray4988 = null;
		aBooleanArray5002 = null;
		vertexScreenY = null;
		vertexScreenX = null;
		vertexDepth = null;
		projectSceneX = null;
		projectSceneY = null;
		projectSceneZ = null;
		anIntArray5005 = null;
		depthTriangles = null;
		anIntArray5001 = null;
		anIntArrayArray4999 = null;
		anIntArray5007 = null;
		anIntArray5000 = null;
		anIntArray4990 = null;
		anIntArray5004 = null;
		anIntArray4996 = null;
		anIntArray5008 = null;
	}

	@Override
	public void method1855(int i, int i_47_, int i_48_) {
		for (int i_49_ = 0; i_49_ < anInt4955; i_49_++) {
			vertexX[i_49_] += i;
			vertexY[i_49_] += i_47_;
			vertexZ[i_49_] += i_48_;
		}
		boundsCalculated = false;
	}

	@Override
	public void render(int yaw, int sinCameraPitch, int cosCameraPitch, int sceneX, int sceneZ, int sinCameraYaw, int sceneY, int cosCameraYaw, long l) {
		if (!boundsCalculated)
			calculateBounds();
		int a = cosCameraYaw * sceneZ - sinCameraYaw * sceneX >> 16;
		int i_58_ = sceneY * sinCameraPitch + a * cosCameraPitch >> 16;
		int i_59_ = i_58_ + (boundingPlaneRadius * cosCameraPitch + maxY * sinCameraPitch >> 16);
		if (i_59_ > 50) {
			int i_60_ = i_58_ + (-boundingPlaneRadius * cosCameraPitch + minY * sinCameraPitch >> 16);
			if (i_60_ < 3500) {
				int i_61_ = cosCameraYaw * sceneX + sinCameraYaw * sceneZ >> 16;
				int i_62_ = i_61_ + boundingPlaneRadius << 9;
				if (i_62_ / i_59_ > JunkTex.viewportLeft) {
					int i_63_ = i_61_ - boundingPlaneRadius << 9;
					if (i_63_ / i_59_ < JunkTex.viewportRight) {
						int i_64_ = sceneY * cosCameraPitch - a * sinCameraPitch >> 16;
						int i_65_ = (i_64_ + (boundingPlaneRadius * sinCameraPitch + maxY * cosCameraPitch >> 16) << 9);
						if (i_65_ / i_59_ > Class58.viewportTop) {
							int i_66_ = (i_64_ + ((-boundingPlaneRadius * sinCameraPitch + minY * cosCameraPitch) >> 16) << 9);
							if (i_66_ / i_59_ < Class70.viewportBottom) {
								boolean project = false;
								boolean bool_67_ = i_60_ <= 50;
								boolean bool_68_ = bool_67_ || anInt4966 > 0;
								int i_69_ = SDRaster.anInt118;
								int i_70_ = SDRaster.anInt110;
								int yawsin = 0;
								int yawcos = 0;
								if (yaw != 0) {
									yawsin = SDRaster.sin[yaw];
									yawcos = SDRaster.cos[yaw];
								}
								boolean bool_73_ = false;
								if (l > 0L && Class90.aBoolean1417 && i_60_ > 0) {
									int i_74_;
									int i_75_;
									if (i_61_ > 0) {
										i_74_ = i_63_ / i_59_;
										i_75_ = i_62_ / i_60_;
									} else {
										i_74_ = i_63_ / i_60_;
										i_75_ = i_62_ / i_59_;
									}
									int i_76_;
									int i_77_;
									if (i_64_ > 0) {
										i_76_ = i_66_ / i_59_;
										i_77_ = i_65_ / i_60_;
									} else {
										i_76_ = i_66_ / i_60_;
										i_77_ = i_65_ / i_59_;
									}
									if (Static2.mouseOffFromCenterX >= i_74_ && Static2.mouseOffFromCenterX <= i_75_
											&& Class38.mouseOffFromCenterY >= i_76_ && Class38.mouseOffFromCenterY <= i_77_) {
										i_74_ = 999999;
										i_75_ = -999999;
										i_76_ = 999999;
										i_77_ = -999999;
										int[] is = new int[] { minX, maxX, minX, maxX,
												minX, maxX, minX, maxX };
										int[] is_78_ = new int[] { minZ, minZ, maxZ, maxZ,
												minZ, minZ, maxZ, maxZ };
										int[] is_79_ = new int[] { minY, minY, minY, minY,
												maxY, maxY, maxY, maxY };
										for (int i_80_ = 0; i_80_ < 8; i_80_++) {
											int i_81_ = is[i_80_];
											int i_82_ = is_79_[i_80_];
											int i_83_ = is_78_[i_80_];
											if (yaw != 0) {
												int i_84_ = ((i_83_ * yawsin + i_81_ * yawcos) >> 16);
												i_83_ = (i_83_ * yawcos - i_81_ * yawsin) >> 16;
												i_81_ = i_84_;
											}
											i_81_ += sinCameraYaw;
											i_82_ += sceneY;
											i_83_ += cosCameraYaw;
											int i_85_ = ((i_83_ * sceneX + i_81_ * sceneZ) >> 16);
											i_83_ = (i_83_ * sceneZ - i_81_ * sceneX) >> 16;
											i_81_ = i_85_;
											i_85_ = (i_82_ * cosCameraPitch - i_83_ * sinCameraPitch) >> 16;
											i_83_ = (i_82_ * sinCameraPitch + i_83_ * cosCameraPitch) >> 16;
											i_82_ = i_85_;
											if (i_83_ > 0) {
												int i_86_ = (i_81_ << 9) / i_83_;
												int i_87_ = (i_82_ << 9) / i_83_;
												if (i_86_ < i_74_)
													i_74_ = i_86_;
												if (i_86_ > i_75_)
													i_75_ = i_86_;
												if (i_87_ < i_76_)
													i_76_ = i_87_;
												if (i_87_ > i_77_)
													i_77_ = i_87_;
											}
										}
										if (Static2.mouseOffFromCenterX >= i_74_ && Static2.mouseOffFromCenterX <= i_75_
												&& Class38.mouseOffFromCenterY >= i_76_ && Class38.mouseOffFromCenterY <= i_77_) {
											if (haveActions)
												Class7_Sub3.actions[Class14_Sub15.actionsLen++] = l;
											else
												bool_73_ = true;
										}
									}
								}
								for (int i_88_ = 0; i_88_ < anInt4955; i_88_++) {
									int xVertex = vertexX[i_88_];
									int yVertex = vertexY[i_88_];
									int zVertex = vertexZ[i_88_];
									if (yaw != 0) {
										int i_92_ = (zVertex * yawsin + xVertex * yawcos >> 16);
										zVertex = (zVertex * yawcos - xVertex * yawsin >> 16);
										xVertex = i_92_;
									}
									xVertex += sinCameraYaw;
									yVertex += sceneY;
									zVertex += cosCameraYaw;
									int i_93_ = zVertex * sceneX + xVertex * sceneZ >> 16;
									zVertex = zVertex * sceneZ - xVertex * sceneX >> 16;
									xVertex = i_93_;
									i_93_ = yVertex * cosCameraPitch - zVertex * sinCameraPitch >> 16;
									zVertex = yVertex * sinCameraPitch + zVertex * cosCameraPitch >> 16;
									yVertex = i_93_;
									vertexDepth[i_88_] = zVertex - i_58_;
									if (zVertex >= 50) {
										vertexScreenY[i_88_] = i_69_ + (xVertex << 9) / zVertex;
										vertexScreenX[i_88_] = i_70_ + (yVertex << 9) / zVertex;
									} else {
										vertexScreenY[i_88_] = -5000;
										project = true;
									}
									if (bool_68_) {
										projectSceneX[i_88_] = xVertex;
										projectSceneY[i_88_] = yVertex;
										projectSceneZ[i_88_] = zVertex;
									}
								}
								try {
									draw(project, bool_73_, l, i_58_ - i_60_, i_59_ - i_60_ + 2);
								} catch (Exception exception) {
									/* empty */
								}
							}
						}
					}
				}
			}
		}
	}

	public void draw(boolean bool, boolean bool_94_, long l, int i, int i_95_) {
		if (i_95_ < 1600) {
			int i_96_ = 0;
			for (int i_97_ = 0; i_97_ < triangleCount; i_97_++) {
				if (triangleInfo[i_97_] != -2) {
					int i_98_ = triangleVertexA[i_97_];
					int i_99_ = triangleVertexB[i_97_];
					int i_100_ = triangleVertexC[i_97_];
					int i_101_ = vertexScreenY[i_98_];
					int i_102_ = vertexScreenY[i_99_];
					int i_103_ = vertexScreenY[i_100_];
					if (bool && (i_101_ == -5000 || i_102_ == -5000 || i_103_ == -5000)) {
						int i_104_ = projectSceneX[i_98_];
						int i_105_ = projectSceneX[i_99_];
						int i_106_ = projectSceneX[i_100_];
						int i_107_ = projectSceneY[i_98_];
						int i_108_ = projectSceneY[i_99_];
						int i_109_ = projectSceneY[i_100_];
						int i_110_ = projectSceneZ[i_98_];
						int i_111_ = projectSceneZ[i_99_];
						int i_112_ = projectSceneZ[i_100_];
						i_104_ -= i_105_;
						i_106_ -= i_105_;
						i_107_ -= i_108_;
						i_109_ -= i_108_;
						i_110_ -= i_111_;
						i_112_ -= i_111_;
						int i_113_ = i_107_ * i_112_ - i_110_ * i_109_;
						int i_114_ = i_110_ * i_106_ - i_104_ * i_112_;
						int i_115_ = i_104_ * i_109_ - i_107_ * i_106_;
						if (i_105_ * i_113_ + i_108_ * i_114_ + i_111_ * i_115_ > 0) {
							aBooleanArray5002[i_97_] = true;
							anIntArray5005[i_96_] = (vertexDepth[i_98_] + vertexDepth[i_99_] + vertexDepth[i_100_]) / 3;
							depthTriangles[i_96_++] = i_97_;
						}
					} else {
						if (bool_94_ && method1879(Static2.mouseOffFromCenterX + SDRaster.anInt118,
								Class38.mouseOffFromCenterY + SDRaster.anInt110, vertexScreenX[i_98_], vertexScreenX[i_99_],
								vertexScreenX[i_100_], i_101_, i_102_, i_103_)) {
							Class7_Sub3.actions[Class14_Sub15.actionsLen++] = l;
							bool_94_ = false;
						}
						if (((i_101_ - i_102_) * (vertexScreenX[i_100_] - vertexScreenX[i_99_])
								- ((vertexScreenX[i_98_] - vertexScreenX[i_99_]) * (i_103_ - i_102_))) > 0) {
							aBooleanArray5002[i_97_] = false;
							if (i_101_ < 0 || i_102_ < 0 || i_103_ < 0 || i_101_ > SDRaster.anInt109
									|| i_102_ > SDRaster.anInt109 || i_103_ > SDRaster.anInt109)
								aBooleanArray4988[i_97_] = true;
							else
								aBooleanArray4988[i_97_] = false;
							anIntArray5005[i_96_] = (vertexDepth[i_98_] + vertexDepth[i_99_] + vertexDepth[i_100_]) / 3;
							depthTriangles[i_96_++] = i_97_;
						}
					}
				}
			}
			method1486(i_96_ - 1, 0, (byte) -110, depthTriangles, anIntArray5005);
			if (aByteArray4973 == null) {
				for (int i_116_ = 0; i_116_ < i_96_; i_116_++)
					drawTriangle(depthTriangles[i_116_]);
			} else {
				for (int i_117_ = 0; i_117_ < 12; i_117_++) {
					anIntArray5001[i_117_] = 0;
					anIntArray4990[i_117_] = 0;
				}
				for (int i_118_ = 0; i_118_ < i_96_; i_118_++) {
					int i_119_ = depthTriangles[i_118_];
					int i_120_ = anIntArray5005[i_118_];
					byte i_121_ = aByteArray4973[i_119_];
					int i_122_ = anIntArray5001[i_121_]++;
					anIntArrayArray4999[i_121_][i_122_] = i_119_;
					if (i_121_ < 10)
						anIntArray4990[i_121_] += i_120_;
					else if (i_121_ == 10)
						anIntArray5007[i_122_] = i_120_;
					else
						anIntArray5000[i_122_] = i_120_;
				}
				int i_123_ = 0;
				if (anIntArray5001[1] > 0 || anIntArray5001[2] > 0)
					i_123_ = ((anIntArray4990[1] + anIntArray4990[2]) / (anIntArray5001[1] + anIntArray5001[2]));
				int i_124_ = 0;
				if (anIntArray5001[3] > 0 || anIntArray5001[4] > 0)
					i_124_ = ((anIntArray4990[3] + anIntArray4990[4]) / (anIntArray5001[3] + anIntArray5001[4]));
				int i_125_ = 0;
				if (anIntArray5001[6] > 0 || anIntArray5001[8] > 0)
					i_125_ = ((anIntArray4990[6] + anIntArray4990[8]) / (anIntArray5001[6] + anIntArray5001[8]));
				int i_126_ = 0;
				int i_127_ = anIntArray5001[10];
				int[] is = anIntArrayArray4999[10];
				int[] is_128_ = anIntArray5007;
				if (i_126_ == i_127_) {
					i_126_ = 0;
					i_127_ = anIntArray5001[11];
					is = anIntArrayArray4999[11];
					is_128_ = anIntArray5000;
				}
				int i_129_;
				if (i_126_ < i_127_)
					i_129_ = is_128_[i_126_];
				else
					i_129_ = -1000;
				for (int i_130_ = 0; i_130_ < 10; i_130_++) {
					while (i_130_ == 0) {
						if (i_129_ <= i_123_)
							break;
						drawTriangle(is[i_126_++]);
						if (i_126_ == i_127_ && is != anIntArrayArray4999[11]) {
							i_126_ = 0;
							i_127_ = anIntArray5001[11];
							is = anIntArrayArray4999[11];
							is_128_ = anIntArray5000;
						}
						if (i_126_ < i_127_)
							i_129_ = is_128_[i_126_];
						else
							i_129_ = -1000;
					}
					while (i_130_ == 3) {
						if (i_129_ <= i_124_)
							break;
						drawTriangle(is[i_126_++]);
						if (i_126_ == i_127_ && is != anIntArrayArray4999[11]) {
							i_126_ = 0;
							i_127_ = anIntArray5001[11];
							is = anIntArrayArray4999[11];
							is_128_ = anIntArray5000;
						}
						if (i_126_ < i_127_)
							i_129_ = is_128_[i_126_];
						else
							i_129_ = -1000;
					}
					while (i_130_ == 5 && i_129_ > i_125_) {
						drawTriangle(is[i_126_++]);
						if (i_126_ == i_127_ && is != anIntArrayArray4999[11]) {
							i_126_ = 0;
							i_127_ = anIntArray5001[11];
							is = anIntArrayArray4999[11];
							is_128_ = anIntArray5000;
						}
						if (i_126_ < i_127_)
							i_129_ = is_128_[i_126_];
						else
							i_129_ = -1000;
					}
					int i_131_ = anIntArray5001[i_130_];
					int[] is_132_ = anIntArrayArray4999[i_130_];
					for (int i_133_ = 0; i_133_ < i_131_; i_133_++)
						drawTriangle(is_132_[i_133_]);
				}
				while (i_129_ != -1000) {
					drawTriangle(is[i_126_++]);
					if (i_126_ == i_127_ && is != anIntArrayArray4999[11]) {
						i_126_ = 0;
						is = anIntArrayArray4999[11];
						i_127_ = anIntArray5001[11];
						is_128_ = anIntArray5000;
					}
					if (i_126_ < i_127_)
						i_129_ = is_128_[i_126_];
					else
						i_129_ = -1000;
				}
			}
		}
	}

	@Override
	public void method1857(AnimFrameLoader class14_sub2_sub15, int i, boolean bool) {
		if (anIntArrayArray4959 != null && i != -1) {
			AnimFrame animframe = class14_sub2_sub15.aClass143Array3951[i];
			AnimFrameBase animframebase = animframe.base;
			anInt5003 = 0;
			anInt4998 = 0;
			anInt4995 = 0;
			for (int i_134_ = 0; i_134_ < animframe.transformationCount; i_134_++) {
				short i_135_ = animframe.transformationIndices[i_134_];
				if (animframe.aShortArray2338[i_134_] != -1)
					method1885(0, (animframebase.labels[animframe.aShortArray2338[i_134_]]), 0, 0, 0);
				method1885(animframebase.transformationType[i_135_], animframebase.labels[i_135_],
						animframe.transformX[i_134_], animframe.transformY[i_134_],
						animframe.transformZ[i_134_]);
			}
			boundsCalculated = false;
		}
	}

	public boolean method1879(int i, int i_136_, int i_137_, int i_138_, int i_139_, int i_140_, int i_141_,
			int i_142_) {
		if (i_136_ < i_137_ && i_136_ < i_138_ && i_136_ < i_139_)
			return false;
		if (i_136_ > i_137_ && i_136_ > i_138_ && i_136_ > i_139_)
			return false;
		if (i < i_140_ && i < i_141_ && i < i_142_)
			return false;
		if (i > i_140_ && i > i_141_ && i > i_142_)
			return false;
		return true;
	}

	@Override
	public int getMinYorMaxYCheckTHIS() {
		if (!boundsCalculated)
			calculateBounds();
		return minY;
	}

	public static int blendColours(int i, int i_143_) {
		i_143_ = i_143_ * (i & 0x7f) >> 7;
		if (i_143_ < 2)
			i_143_ = 2;
		else if (i_143_ > 126)
			i_143_ = 126;
		return (i & 0xff80) + i_143_;
	}

	@Override
	public void method1872() {
		for (int i = 0; i < anInt4955; i++) {
			vertexX[i] = -vertexX[i];
			vertexZ[i] = -vertexZ[i];
		}
		boundsCalculated = false;
	}

	@Override
	public void method1875() {
		for (int i = 0; i < anInt4955; i++) {
			int i_144_ = vertexZ[i];
			vertexZ[i] = vertexX[i];
			vertexX[i] = -i_144_;
		}
		boundsCalculated = false;
	}

	@Override
	public int method1868() {
		if (!boundsCalculated)
			calculateBounds();
		return minZ;
	}

	@Override
	public void method1859(AnimFrameLoader class14_sub2_sub15, int i) {
		if (anIntArrayArray4959 != null && i != -1) {
			AnimFrame animframe = class14_sub2_sub15.aClass143Array3951[i];
			AnimFrameBase animframebase = animframe.base;
			anInt5003 = 0;
			anInt4998 = 0;
			anInt4995 = 0;
			for (int i_145_ = 0; i_145_ < animframe.transformationCount; i_145_++) {
				short i_146_ = animframe.transformationIndices[i_145_];
				if (animframebase.aBooleanArray2791[i_146_]) {
					if (animframe.aShortArray2338[i_145_] != -1)
						method1884(0, 0, 0, 0);
					method1884(animframebase.transformationType[i_146_], animframe.transformX[i_145_],
							animframe.transformY[i_145_], animframe.transformZ[i_145_]);
				}
			}
			boundsCalculated = false;
		}
	}

	@Override
	public SceneGraphNode_AbstractModelRenderer method1860(boolean bool, boolean bool_147_) {
		if (!bool && aByteArray4986.length < triangleCount)
			aByteArray4986 = new byte[triangleCount + 100];
		return method1886(bool, aClass133_Sub7_Sub1_4975, aByteArray4986);
	}

	@Override
	public void method1869(int i, int i_148_, int i_149_) {
		for (int i_150_ = 0; i_150_ < anInt4955; i_150_++) {
			vertexX[i_150_] = vertexX[i_150_] * i / 128;
			vertexY[i_150_] = vertexY[i_150_] * i_148_ / 128;
			vertexZ[i_150_] = vertexZ[i_150_] * i_149_ / 128;
		}
		boundsCalculated = false;
	}

	public static int method1881(int i) {
		if (i < 2)
			i = 2;
		else if (i > 126)
			i = 126;
		return i;
	}

	@Override
	public int method1856() {
		if (!boundsCalculated)
			calculateBounds();
		return maxX;
	}

	public void method1882(int i) {
		int i_151_ = SDRaster.anInt118;
		int i_152_ = SDRaster.anInt110;
		int i_153_ = 0;
		int i_154_ = triangleVertexA[i];
		int i_155_ = triangleVertexB[i];
		int i_156_ = triangleVertexC[i];
		int i_157_ = projectSceneZ[i_154_];
		int i_158_ = projectSceneZ[i_155_];
		int i_159_ = projectSceneZ[i_156_];
		if (aByteArray4983 == null)
			SDRaster.anInt116 = 0;
		else
			SDRaster.anInt116 = aByteArray4983[i] & 0xff;
		if (i_157_ >= 50) {
			anIntArray5004[i_153_] = vertexScreenY[i_154_];
			anIntArray4996[i_153_] = vertexScreenX[i_154_];
			anIntArray5008[i_153_++] = anIntArray4957[i];
		} else {
			int i_160_ = projectSceneX[i_154_];
			int i_161_ = projectSceneY[i_154_];
			int i_162_ = anIntArray4957[i];
			if (i_159_ >= 50) {
				int i_163_ = (50 - i_157_) * SDRaster.anIntArray105[i_159_ - i_157_];
				anIntArray5004[i_153_] = (i_151_
						+ (i_160_ + ((projectSceneX[i_156_] - i_160_) * i_163_ >> 16) << 9) / 50);
				anIntArray4996[i_153_] = (i_152_
						+ (i_161_ + ((projectSceneY[i_156_] - i_161_) * i_163_ >> 16) << 9) / 50);
				anIntArray5008[i_153_++] = i_162_ + ((triangleInfo[i] - i_162_) * i_163_ >> 16);
			}
			if (i_158_ >= 50) {
				int i_164_ = (50 - i_157_) * SDRaster.anIntArray105[i_158_ - i_157_];
				anIntArray5004[i_153_] = (i_151_
						+ (i_160_ + ((projectSceneX[i_155_] - i_160_) * i_164_ >> 16) << 9) / 50);
				anIntArray4996[i_153_] = (i_152_
						+ (i_161_ + ((projectSceneY[i_155_] - i_161_) * i_164_ >> 16) << 9) / 50);
				anIntArray5008[i_153_++] = i_162_ + ((anIntArray4978[i] - i_162_) * i_164_ >> 16);
			}
		}
		if (i_158_ >= 50) {
			anIntArray5004[i_153_] = vertexScreenY[i_155_];
			anIntArray4996[i_153_] = vertexScreenX[i_155_];
			anIntArray5008[i_153_++] = anIntArray4978[i];
		} else {
			int i_165_ = projectSceneX[i_155_];
			int i_166_ = projectSceneY[i_155_];
			int i_167_ = anIntArray4978[i];
			if (i_157_ >= 50) {
				int i_168_ = (50 - i_158_) * SDRaster.anIntArray105[i_157_ - i_158_];
				anIntArray5004[i_153_] = (i_151_
						+ (i_165_ + ((projectSceneX[i_154_] - i_165_) * i_168_ >> 16) << 9) / 50);
				anIntArray4996[i_153_] = (i_152_
						+ (i_166_ + ((projectSceneY[i_154_] - i_166_) * i_168_ >> 16) << 9) / 50);
				anIntArray5008[i_153_++] = i_167_ + ((anIntArray4957[i] - i_167_) * i_168_ >> 16);
			}
			if (i_159_ >= 50) {
				int i_169_ = (50 - i_158_) * SDRaster.anIntArray105[i_159_ - i_158_];
				anIntArray5004[i_153_] = (i_151_
						+ (i_165_ + ((projectSceneX[i_156_] - i_165_) * i_169_ >> 16) << 9) / 50);
				anIntArray4996[i_153_] = (i_152_
						+ (i_166_ + ((projectSceneY[i_156_] - i_166_) * i_169_ >> 16) << 9) / 50);
				anIntArray5008[i_153_++] = i_167_ + ((triangleInfo[i] - i_167_) * i_169_ >> 16);
			}
		}
		if (i_159_ >= 50) {
			anIntArray5004[i_153_] = vertexScreenY[i_156_];
			anIntArray4996[i_153_] = vertexScreenX[i_156_];
			anIntArray5008[i_153_++] = triangleInfo[i];
		} else {
			int i_170_ = projectSceneX[i_156_];
			int i_171_ = projectSceneY[i_156_];
			int i_172_ = triangleInfo[i];
			if (i_158_ >= 50) {
				int i_173_ = (50 - i_159_) * SDRaster.anIntArray105[i_158_ - i_159_];
				anIntArray5004[i_153_] = (i_151_
						+ (i_170_ + ((projectSceneX[i_155_] - i_170_) * i_173_ >> 16) << 9) / 50);
				anIntArray4996[i_153_] = (i_152_
						+ (i_171_ + ((projectSceneY[i_155_] - i_171_) * i_173_ >> 16) << 9) / 50);
				anIntArray5008[i_153_++] = i_172_ + ((anIntArray4978[i] - i_172_) * i_173_ >> 16);
			}
			if (i_157_ >= 50) {
				int i_174_ = (50 - i_159_) * SDRaster.anIntArray105[i_157_ - i_159_];
				anIntArray5004[i_153_] = (i_151_
						+ (i_170_ + ((projectSceneX[i_154_] - i_170_) * i_174_ >> 16) << 9) / 50);
				anIntArray4996[i_153_] = (i_152_
						+ (i_171_ + ((projectSceneY[i_154_] - i_171_) * i_174_ >> 16) << 9) / 50);
				anIntArray5008[i_153_++] = i_172_ + ((anIntArray4957[i] - i_172_) * i_174_ >> 16);
			}
		}
		int i_175_ = anIntArray5004[0];
		int i_176_ = anIntArray5004[1];
		int i_177_ = anIntArray5004[2];
		int i_178_ = anIntArray4996[0];
		int i_179_ = anIntArray4996[1];
		int i_180_ = anIntArray4996[2];
		SDRaster.aBoolean112 = false;
		if (i_153_ == 3) {
			if (i_175_ < 0 || i_176_ < 0 || i_177_ < 0 || i_175_ > SDRaster.anInt109 || i_176_ > SDRaster.anInt109
					|| i_177_ > SDRaster.anInt109)
				SDRaster.aBoolean112 = true;
			if (aShortArray4984 == null || aShortArray4984[i] == -1) {
				if (triangleInfo[i] == -1)
					SDRaster.method107(i_178_, i_179_, i_180_, i_175_, i_176_, i_177_,
							SDRaster.anIntArray119[anIntArray4957[i]]);
				else
					SDRaster.method104(i_178_, i_179_, i_180_, i_175_, i_176_, i_177_, anIntArray5008[0],
							anIntArray5008[1], anIntArray5008[2]);
			} else {
				int i_181_;
				int i_182_;
				int i_183_;
				if (aByteArray4971 != null && aByteArray4971[i] != -1) {
					int i_184_ = aByteArray4971[i] & 0xff;
					i_181_ = anIntArray4960[i_184_];
					i_182_ = anIntArray4981[i_184_];
					i_183_ = anIntArray4964[i_184_];
				} else {
					i_181_ = i_154_;
					i_182_ = i_155_;
					i_183_ = i_156_;
				}
				if (triangleInfo[i] == -1)
					SDRaster.method98(i_178_, i_179_, i_180_, i_175_, i_176_, i_177_, anIntArray4957[i],
							anIntArray4957[i], anIntArray4957[i], projectSceneX[i_181_], projectSceneX[i_182_],
							projectSceneX[i_183_], projectSceneY[i_181_], projectSceneY[i_182_], projectSceneY[i_183_],
							projectSceneZ[i_181_], projectSceneZ[i_182_], projectSceneZ[i_183_], aShortArray4984[i]);
				else
					SDRaster.method98(i_178_, i_179_, i_180_, i_175_, i_176_, i_177_, anIntArray5008[0],
							anIntArray5008[1], anIntArray5008[2], projectSceneX[i_181_], projectSceneX[i_182_],
							projectSceneX[i_183_], projectSceneY[i_181_], projectSceneY[i_182_], projectSceneY[i_183_],
							projectSceneZ[i_181_], projectSceneZ[i_182_], projectSceneZ[i_183_], aShortArray4984[i]);
			}
		}
		if (i_153_ == 4) {
			if (i_175_ < 0 || i_176_ < 0 || i_177_ < 0 || i_175_ > SDRaster.anInt109 || i_176_ > SDRaster.anInt109
					|| i_177_ > SDRaster.anInt109 || anIntArray5004[3] < 0 || anIntArray5004[3] > SDRaster.anInt109)
				SDRaster.aBoolean112 = true;
			if (aShortArray4984 == null || aShortArray4984[i] == -1) {
				if (triangleInfo[i] == -1) {
					int i_185_ = SDRaster.anIntArray119[anIntArray4957[i]];
					SDRaster.method107(i_178_, i_179_, i_180_, i_175_, i_176_, i_177_, i_185_);
					SDRaster.method107(i_178_, i_180_, anIntArray4996[3], i_175_, i_177_, anIntArray5004[3], i_185_);
				} else {
					SDRaster.method104(i_178_, i_179_, i_180_, i_175_, i_176_, i_177_, anIntArray5008[0],
							anIntArray5008[1], anIntArray5008[2]);
					SDRaster.method104(i_178_, i_180_, anIntArray4996[3], i_175_, i_177_, anIntArray5004[3],
							anIntArray5008[0], anIntArray5008[2], anIntArray5008[3]);
				}
			} else {
				int i_186_;
				int i_187_;
				int i_188_;
				if (aByteArray4971 != null && aByteArray4971[i] != -1) {
					int i_189_ = aByteArray4971[i] & 0xff;
					i_186_ = anIntArray4960[i_189_];
					i_187_ = anIntArray4981[i_189_];
					i_188_ = anIntArray4964[i_189_];
				} else {
					i_186_ = i_154_;
					i_187_ = i_155_;
					i_188_ = i_156_;
				}
				short i_190_ = aShortArray4984[i];
				if (triangleInfo[i] == -1) {
					SDRaster.method98(i_178_, i_179_, i_180_, i_175_, i_176_, i_177_, anIntArray4957[i],
							anIntArray4957[i], anIntArray4957[i], projectSceneX[i_186_], projectSceneX[i_187_],
							projectSceneX[i_188_], projectSceneY[i_186_], projectSceneY[i_187_], projectSceneY[i_188_],
							projectSceneZ[i_186_], projectSceneZ[i_187_], projectSceneZ[i_188_], i_190_);
					SDRaster.method98(i_178_, i_180_, anIntArray4996[3], i_175_, i_177_, anIntArray5004[3],
							anIntArray4957[i], anIntArray4957[i], anIntArray4957[i], projectSceneX[i_186_],
							projectSceneX[i_187_], projectSceneX[i_188_], projectSceneY[i_186_], projectSceneY[i_187_],
							projectSceneY[i_188_], projectSceneZ[i_186_], projectSceneZ[i_187_], projectSceneZ[i_188_],
							i_190_);
				} else {
					SDRaster.method98(i_178_, i_179_, i_180_, i_175_, i_176_, i_177_, anIntArray5008[0],
							anIntArray5008[1], anIntArray5008[2], projectSceneX[i_186_], projectSceneX[i_187_],
							projectSceneX[i_188_], projectSceneY[i_186_], projectSceneY[i_187_], projectSceneY[i_188_],
							projectSceneZ[i_186_], projectSceneZ[i_187_], projectSceneZ[i_188_], i_190_);
					SDRaster.method98(i_178_, i_180_, anIntArray4996[3], i_175_, i_177_, anIntArray5004[3],
							anIntArray5008[0], anIntArray5008[2], anIntArray5008[3], projectSceneX[i_186_],
							projectSceneX[i_187_], projectSceneX[i_188_], projectSceneY[i_186_], projectSceneY[i_187_],
							projectSceneY[i_188_], projectSceneZ[i_186_], projectSceneZ[i_187_], projectSceneZ[i_188_],
							i_190_);
				}
			}
		}
	}

	@Override
	public void method1861(int i) {
		int i_191_ = SDRaster.sin[i];
		int i_192_ = SDRaster.cos[i];
		for (int i_193_ = 0; i_193_ < anInt4955; i_193_++) {
			int i_194_ = ((vertexY[i_193_] * i_192_ - vertexZ[i_193_] * i_191_) >> 16);
			vertexZ[i_193_] = (vertexY[i_193_] * i_191_ + vertexZ[i_193_] * i_192_) >> 16;
			vertexY[i_193_] = i_194_;
		}
		boundsCalculated = false;
	}

	@Override
	public void method1858(int i) {
		int i_195_ = SDRaster.sin[i];
		int i_196_ = SDRaster.cos[i];
		for (int i_197_ = 0; i_197_ < anInt4955; i_197_++) {
			int i_198_ = ((vertexY[i_197_] * i_195_ + vertexX[i_197_] * i_196_) >> 16);
			vertexY[i_197_] = (vertexY[i_197_] * i_196_ - vertexX[i_197_] * i_195_) >> 16;
			vertexX[i_197_] = i_198_;
		}
		boundsCalculated = false;
	}

	public void drawTriangle(int i) {
		if (aBooleanArray5002[i])
			method1882(i);
		else {
			int i_199_ = triangleVertexA[i];
			int i_200_ = triangleVertexB[i];
			int i_201_ = triangleVertexC[i];
			SDRaster.aBoolean112 = aBooleanArray4988[i];
			if (aByteArray4983 == null)
				SDRaster.anInt116 = 0;
			else
				SDRaster.anInt116 = aByteArray4983[i] & 0xff;
			if (aShortArray4984 == null || aShortArray4984[i] == -1) {
				if (triangleInfo[i] == -1)
					SDRaster.method107(vertexScreenX[i_199_], vertexScreenX[i_200_], vertexScreenX[i_201_],
							vertexScreenY[i_199_], vertexScreenY[i_200_], vertexScreenY[i_201_],
							SDRaster.anIntArray119[anIntArray4957[i]]);
				else
					SDRaster.method104(vertexScreenX[i_199_], vertexScreenX[i_200_], vertexScreenX[i_201_],
							vertexScreenY[i_199_], vertexScreenY[i_200_], vertexScreenY[i_201_], anIntArray4957[i],
							anIntArray4978[i], triangleInfo[i]);
			} else {
				int i_202_;
				int i_203_;
				int i_204_;
				if (aByteArray4971 != null && aByteArray4971[i] != -1) {
					int i_205_ = aByteArray4971[i] & 0xff;
					i_202_ = anIntArray4960[i_205_];
					i_203_ = anIntArray4981[i_205_];
					i_204_ = anIntArray4964[i_205_];
				} else {
					i_202_ = i_199_;
					i_203_ = i_200_;
					i_204_ = i_201_;
				}
				if (triangleInfo[i] == -1)
					SDRaster.method98(vertexScreenX[i_199_], vertexScreenX[i_200_], vertexScreenX[i_201_],
							vertexScreenY[i_199_], vertexScreenY[i_200_], vertexScreenY[i_201_], anIntArray4957[i],
							anIntArray4957[i], anIntArray4957[i], projectSceneX[i_202_], projectSceneX[i_203_],
							projectSceneX[i_204_], projectSceneY[i_202_], projectSceneY[i_203_], projectSceneY[i_204_],
							projectSceneZ[i_202_], projectSceneZ[i_203_], projectSceneZ[i_204_], aShortArray4984[i]);
				else
					SDRaster.method98(vertexScreenX[i_199_], vertexScreenX[i_200_], vertexScreenX[i_201_],
							vertexScreenY[i_199_], vertexScreenY[i_200_], vertexScreenY[i_201_], anIntArray4957[i],
							anIntArray4978[i], triangleInfo[i], projectSceneX[i_202_], projectSceneX[i_203_],
							projectSceneX[i_204_], projectSceneY[i_202_], projectSceneY[i_203_], projectSceneY[i_204_],
							projectSceneZ[i_202_], projectSceneZ[i_203_], projectSceneZ[i_204_], aShortArray4984[i]);
			}
		}
	}

	public void method1884(int i, int i_206_, int i_207_, int i_208_) {
		if (i == 0) {
			int i_209_ = 0;
			anInt5003 = 0;
			anInt4998 = 0;
			anInt4995 = 0;
			for (int i_210_ = 0; i_210_ < anInt4955; i_210_++) {
				anInt5003 += vertexX[i_210_];
				anInt4998 += vertexY[i_210_];
				anInt4995 += vertexZ[i_210_];
				i_209_++;
			}
			if (i_209_ > 0) {
				anInt5003 = anInt5003 / i_209_ + i_206_;
				anInt4998 = anInt4998 / i_209_ + i_207_;
				anInt4995 = anInt4995 / i_209_ + i_208_;
			} else {
				anInt5003 = i_206_;
				anInt4998 = i_207_;
				anInt4995 = i_208_;
			}
		} else if (i == 1) {
			for (int i_211_ = 0; i_211_ < anInt4955; i_211_++) {
				vertexX[i_211_] += i_206_;
				vertexY[i_211_] += i_207_;
				vertexZ[i_211_] += i_208_;
			}
		} else if (i == 2) {
			for (int i_212_ = 0; i_212_ < anInt4955; i_212_++) {
				vertexX[i_212_] -= anInt5003;
				vertexY[i_212_] -= anInt4998;
				vertexZ[i_212_] -= anInt4995;
				if (i_208_ != 0) {
					int i_213_ = SDRaster.sin[i_208_];
					int i_214_ = SDRaster.cos[i_208_];
					int i_215_ = ((vertexY[i_212_] * i_213_ + vertexX[i_212_] * i_214_ + 32767) >> 16);
					vertexY[i_212_] = (vertexY[i_212_] * i_214_ - vertexX[i_212_] * i_213_
							+ 32767) >> 16;
					vertexX[i_212_] = i_215_;
				}
				if (i_206_ != 0) {
					int i_216_ = SDRaster.sin[i_206_];
					int i_217_ = SDRaster.cos[i_206_];
					int i_218_ = ((vertexY[i_212_] * i_217_ - vertexZ[i_212_] * i_216_ + 32767) >> 16);
					vertexZ[i_212_] = (vertexY[i_212_] * i_216_ + vertexZ[i_212_] * i_217_
							+ 32767) >> 16;
					vertexY[i_212_] = i_218_;
				}
				if (i_207_ != 0) {
					int i_219_ = SDRaster.sin[i_207_];
					int i_220_ = SDRaster.cos[i_207_];
					int i_221_ = ((vertexZ[i_212_] * i_219_ + vertexX[i_212_] * i_220_ + 32767) >> 16);
					vertexZ[i_212_] = (vertexZ[i_212_] * i_220_ - vertexX[i_212_] * i_219_
							+ 32767) >> 16;
					vertexX[i_212_] = i_221_;
				}
				vertexX[i_212_] += anInt5003;
				vertexY[i_212_] += anInt4998;
				vertexZ[i_212_] += anInt4995;
			}
		} else if (i == 3) {
			for (int i_222_ = 0; i_222_ < anInt4955; i_222_++) {
				vertexX[i_222_] -= anInt5003;
				vertexY[i_222_] -= anInt4998;
				vertexZ[i_222_] -= anInt4995;
				vertexX[i_222_] = vertexX[i_222_] * i_206_ / 128;
				vertexY[i_222_] = vertexY[i_222_] * i_207_ / 128;
				vertexZ[i_222_] = vertexZ[i_222_] * i_208_ / 128;
				vertexX[i_222_] += anInt5003;
				vertexY[i_222_] += anInt4998;
				vertexZ[i_222_] += anInt4995;
			}
		} else if (i == 5) {
			for (int i_223_ = 0; i_223_ < triangleCount; i_223_++) {
				int i_224_ = (aByteArray4983[i_223_] & 0xff) + i_206_ * 8;
				if (i_224_ < 0)
					i_224_ = 0;
				else if (i_224_ > 255)
					i_224_ = 255;
				aByteArray4983[i_223_] = (byte) i_224_;
			}
		}
	}

	@Override
	public int method1865() {
		if (!boundsCalculated)
			calculateBounds();
		return maxZ;
	}

	public void method1885(int i, int[] is, int i_225_, int i_226_, int i_227_) {
		int i_228_ = is.length;
		if (i == 0) {
			int i_229_ = 0;
			anInt5003 = 0;
			anInt4998 = 0;
			anInt4995 = 0;
			for (int i_230_ = 0; i_230_ < i_228_; i_230_++) {
				int i_231_ = is[i_230_];
				if (i_231_ < anIntArrayArray4959.length) {
					int[] is_232_ = anIntArrayArray4959[i_231_];
					for (int i_233_ = 0; i_233_ < is_232_.length; i_233_++) {
						int i_234_ = is_232_[i_233_];
						anInt5003 += vertexX[i_234_];
						anInt4998 += vertexY[i_234_];
						anInt4995 += vertexZ[i_234_];
						i_229_++;
					}
				}
			}
			if (i_229_ > 0) {
				anInt5003 = anInt5003 / i_229_ + i_225_;
				anInt4998 = anInt4998 / i_229_ + i_226_;
				anInt4995 = anInt4995 / i_229_ + i_227_;
			} else {
				anInt5003 = i_225_;
				anInt4998 = i_226_;
				anInt4995 = i_227_;
			}
		} else if (i == 1) {
			for (int i_235_ = 0; i_235_ < i_228_; i_235_++) {
				int i_236_ = is[i_235_];
				if (i_236_ < anIntArrayArray4959.length) {
					int[] is_237_ = anIntArrayArray4959[i_236_];
					for (int i_238_ = 0; i_238_ < is_237_.length; i_238_++) {
						int i_239_ = is_237_[i_238_];
						vertexX[i_239_] += i_225_;
						vertexY[i_239_] += i_226_;
						vertexZ[i_239_] += i_227_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_240_ = 0; i_240_ < i_228_; i_240_++) {
				int i_241_ = is[i_240_];
				if (i_241_ < anIntArrayArray4959.length) {
					int[] is_242_ = anIntArrayArray4959[i_241_];
					for (int i_243_ = 0; i_243_ < is_242_.length; i_243_++) {
						int i_244_ = is_242_[i_243_];
						vertexX[i_244_] -= anInt5003;
						vertexY[i_244_] -= anInt4998;
						vertexZ[i_244_] -= anInt4995;
						if (i_227_ != 0) {
							int i_245_ = SDRaster.sin[i_227_];
							int i_246_ = SDRaster.cos[i_227_];
							int i_247_ = ((vertexY[i_244_] * i_245_ + vertexX[i_244_] * i_246_
									+ 32767) >> 16);
							vertexY[i_244_] = ((vertexY[i_244_] * i_246_ - vertexX[i_244_] * i_245_
									+ 32767) >> 16);
							vertexX[i_244_] = i_247_;
						}
						if (i_225_ != 0) {
							int i_248_ = SDRaster.sin[i_225_];
							int i_249_ = SDRaster.cos[i_225_];
							int i_250_ = ((vertexY[i_244_] * i_249_ - vertexZ[i_244_] * i_248_
									+ 32767) >> 16);
							vertexZ[i_244_] = ((vertexY[i_244_] * i_248_ + vertexZ[i_244_] * i_249_
									+ 32767) >> 16);
							vertexY[i_244_] = i_250_;
						}
						if (i_226_ != 0) {
							int i_251_ = SDRaster.sin[i_226_];
							int i_252_ = SDRaster.cos[i_226_];
							int i_253_ = ((vertexZ[i_244_] * i_251_ + vertexX[i_244_] * i_252_
									+ 32767) >> 16);
							vertexZ[i_244_] = ((vertexZ[i_244_] * i_252_ - vertexX[i_244_] * i_251_
									+ 32767) >> 16);
							vertexX[i_244_] = i_253_;
						}
						vertexX[i_244_] += anInt5003;
						vertexY[i_244_] += anInt4998;
						vertexZ[i_244_] += anInt4995;
					}
				}
			}
		} else if (i == 3) {
			for (int i_254_ = 0; i_254_ < i_228_; i_254_++) {
				int i_255_ = is[i_254_];
				if (i_255_ < anIntArrayArray4959.length) {
					int[] is_256_ = anIntArrayArray4959[i_255_];
					for (int i_257_ = 0; i_257_ < is_256_.length; i_257_++) {
						int i_258_ = is_256_[i_257_];
						vertexX[i_258_] -= anInt5003;
						vertexY[i_258_] -= anInt4998;
						vertexZ[i_258_] -= anInt4995;
						vertexX[i_258_] = vertexX[i_258_] * i_225_ / 128;
						vertexY[i_258_] = vertexY[i_258_] * i_226_ / 128;
						vertexZ[i_258_] = vertexZ[i_258_] * i_227_ / 128;
						vertexX[i_258_] += anInt5003;
						vertexY[i_258_] += anInt4998;
						vertexZ[i_258_] += anInt4995;
					}
				}
			}
		} else if (i == 5 && anIntArrayArray4961 != null && aByteArray4983 != null) {
			for (int i_259_ = 0; i_259_ < i_228_; i_259_++) {
				int i_260_ = is[i_259_];
				if (i_260_ < anIntArrayArray4961.length) {
					int[] is_261_ = anIntArrayArray4961[i_260_];
					for (int i_262_ = 0; i_262_ < is_261_.length; i_262_++) {
						int i_263_ = is_261_[i_262_];
						int i_264_ = (aByteArray4983[i_263_] & 0xff) + i_225_ * 8;
						if (i_264_ < 0)
							i_264_ = 0;
						else if (i_264_ > 255)
							i_264_ = 255;
						aByteArray4983[i_263_] = (byte) i_264_;
					}
				}
			}
		}
	}

	@Override
	public int method1866() {
		if (!boundsCalculated)
			calculateBounds();
		return boundingPlaneRadius;
	}

	@Override
	public void method1871() {
		for (int i = 0; i < anInt4955; i++) {
			int i_265_ = vertexX[i];
			vertexX[i] = vertexZ[i];
			vertexZ[i] = -i_265_;
		}
		boundsCalculated = false;
	}

	public SceneGraphNode_AbstractModelRenderer method1886(boolean bool, ModelSD modelsd_266_, byte[] is) {
		modelsd_266_.anInt4955 = anInt4955;
		modelsd_266_.triangleCount = triangleCount;
		modelsd_266_.anInt4966 = anInt4966;
		if (modelsd_266_.vertexX == null || modelsd_266_.vertexX.length < anInt4955) {
			modelsd_266_.vertexX = new int[anInt4955 + 100];
			modelsd_266_.vertexY = new int[anInt4955 + 100];
			modelsd_266_.vertexZ = new int[anInt4955 + 100];
		}
		for (int i = 0; i < anInt4955; i++) {
			modelsd_266_.vertexX[i] = vertexX[i];
			modelsd_266_.vertexY[i] = vertexY[i];
			modelsd_266_.vertexZ[i] = vertexZ[i];
		}
		if (bool)
			modelsd_266_.aByteArray4983 = aByteArray4983;
		else {
			modelsd_266_.aByteArray4983 = is;
			if (aByteArray4983 == null) {
				for (int i = 0; i < triangleCount; i++)
					modelsd_266_.aByteArray4983[i] = (byte) 0;
			} else {
				for (int i = 0; i < triangleCount; i++)
					modelsd_266_.aByteArray4983[i] = aByteArray4983[i];
			}
		}
		modelsd_266_.triangleVertexA = triangleVertexA;
		modelsd_266_.triangleVertexB = triangleVertexB;
		modelsd_266_.triangleVertexC = triangleVertexC;
		modelsd_266_.anIntArray4957 = anIntArray4957;
		modelsd_266_.anIntArray4978 = anIntArray4978;
		modelsd_266_.triangleInfo = triangleInfo;
		modelsd_266_.aByteArray4973 = aByteArray4973;
		modelsd_266_.aByteArray4971 = aByteArray4971;
		modelsd_266_.aShortArray4984 = aShortArray4984;
		modelsd_266_.anIntArray4960 = anIntArray4960;
		modelsd_266_.anIntArray4981 = anIntArray4981;
		modelsd_266_.anIntArray4964 = anIntArray4964;
		modelsd_266_.anIntArrayArray4959 = anIntArrayArray4959;
		modelsd_266_.anIntArrayArray4961 = anIntArrayArray4961;
		modelsd_266_.haveActions = haveActions;
		modelsd_266_.boundsCalculated = false;
		return modelsd_266_;
	}

	@Override
	public void method1874(int i) {
		int i_267_ = SDRaster.sin[i];
		int i_268_ = SDRaster.cos[i];
		for (int i_269_ = 0; i_269_ < anInt4955; i_269_++) {
			int i_270_ = ((vertexZ[i_269_] * i_267_ + vertexX[i_269_] * i_268_) >> 16);
			vertexZ[i_269_] = (vertexZ[i_269_] * i_268_ - vertexX[i_269_] * i_267_) >> 16;
			vertexX[i_269_] = i_270_;
		}
		boundsCalculated = false;
	}

	public static void method1486(int i, int i_271_, byte i_272_, int[] is, int[] is_273_) {
		if (i_271_ < i) {
			int i_274_ = (i_271_ + i) / 2;
			int i_275_ = is_273_[i_274_];
			int i_276_ = i_271_;
			is_273_[i_274_] = is_273_[i];
			is_273_[i] = i_275_;
			int i_277_ = is[i_274_];
			is[i_274_] = is[i];
			is[i] = i_277_;
			for (int i_278_ = i_271_; i_278_ < i; i_278_++) {
				if (i_275_ + (i_278_ & 0x1) < is_273_[i_278_]) {
					int i_279_ = is_273_[i_278_];
					is_273_[i_278_] = is_273_[i_276_];
					is_273_[i_276_] = i_279_;
					int i_280_ = is[i_278_];
					is[i_278_] = is[i_276_];
					is[i_276_++] = i_280_;
				}
			}
			is_273_[i] = is_273_[i_276_];
			is_273_[i_276_] = i_275_;
			is[i] = is[i_276_];
			is[i_276_] = i_277_;
			method1486(i_276_ - 1, i_271_, (byte) -110, is, is_273_);
			method1486(i, i_276_ + 1, (byte) -110, is, is_273_);
		}
	}

	public ModelSD() {
		anInt4966 = 0;
		triangleCount = 0;
	}

	public ModelSD(SceneGraphNode_Model class133_sub2, int i, int i_281_, int i_282_, int i_283_, int i_284_) {
		anInt4966 = 0;
		triangleCount = 0;
		class133_sub2.method1826();
		class133_sub2.method1823();
		anInt4955 = class133_sub2.anInt3521;
		vertexX = class133_sub2.anIntArray3530;
		vertexY = class133_sub2.anIntArray3526;
		vertexZ = class133_sub2.anIntArray3510;
		triangleCount = class133_sub2.anInt3547;
		triangleVertexA = class133_sub2.anIntArray3549;
		triangleVertexB = class133_sub2.anIntArray3507;
		triangleVertexC = class133_sub2.anIntArray3540;
		aByteArray4973 = class133_sub2.aByteArray3546;
		aByteArray4983 = class133_sub2.aByteArray3541;
		anIntArrayArray4959 = class133_sub2.anIntArrayArray3545;
		anIntArrayArray4961 = class133_sub2.anIntArrayArray3509;
		int i_285_ = (int) Math.sqrt(i_282_ * i_282_ + i_283_ * i_283_ + i_284_ * i_284_);
		int i_286_ = i_281_ * i_285_ >> 8;
		anIntArray4957 = new int[triangleCount];
		anIntArray4978 = new int[triangleCount];
		triangleInfo = new int[triangleCount];
		if (class133_sub2.aShortArray3528 != null) {
			aShortArray4984 = new short[triangleCount];
			for (int i_287_ = 0; i_287_ < triangleCount; i_287_++) {
				short i_288_ = class133_sub2.aShortArray3528[i_287_];
				if (i_288_ != -1 && SDRaster.anInterface3_117.method13(i_288_))
					aShortArray4984[i_287_] = i_288_;
				else
					aShortArray4984[i_287_] = (short) -1;
			}
		} else
			aShortArray4984 = null;
		if (class133_sub2.anInt3544 > 0 && class133_sub2.aByteArray3535 != null) {
			int[] is = new int[class133_sub2.anInt3544];
			for (int i_289_ = 0; i_289_ < triangleCount; i_289_++) {
				if (class133_sub2.aByteArray3535[i_289_] != -1)
					is[class133_sub2.aByteArray3535[i_289_] & 0xff]++;
			}
			anInt4966 = 0;
			for (int i_290_ = 0; i_290_ < class133_sub2.anInt3544; i_290_++) {
				if (is[i_290_] > 0 && class133_sub2.aByteArray3514[i_290_] == 0)
					anInt4966++;
			}
			anIntArray4960 = new int[anInt4966];
			anIntArray4981 = new int[anInt4966];
			anIntArray4964 = new int[anInt4966];
			int i_291_ = 0;
			for (int i_292_ = 0; i_292_ < class133_sub2.anInt3544; i_292_++) {
				if (is[i_292_] > 0 && class133_sub2.aByteArray3514[i_292_] == 0) {
					anIntArray4960[i_291_] = class133_sub2.aShortArray3520[i_292_] & 0xffff;
					anIntArray4981[i_291_] = class133_sub2.aShortArray3531[i_292_] & 0xffff;
					anIntArray4964[i_291_] = class133_sub2.aShortArray3511[i_292_] & 0xffff;
					is[i_292_] = i_291_++;
				} else
					is[i_292_] = -1;
			}
			aByteArray4971 = new byte[triangleCount];
			for (int i_293_ = 0; i_293_ < triangleCount; i_293_++) {
				if (class133_sub2.aByteArray3535[i_293_] != -1) {
					aByteArray4971[i_293_] = (byte) is[(class133_sub2.aByteArray3535[i_293_] & 0xff)];
					if (aByteArray4971[i_293_] == -1 && aShortArray4984 != null)
						aShortArray4984[i_293_] = (short) -1;
				} else
					aByteArray4971[i_293_] = (byte) -1;
			}
		}
		for (int i_294_ = 0; i_294_ < triangleCount; i_294_++) {
			byte i_295_;
			if (class133_sub2.aByteArray3534 == null)
				i_295_ = (byte) 0;
			else
				i_295_ = class133_sub2.aByteArray3534[i_294_];
			byte i_296_;
			if (class133_sub2.aByteArray3541 == null)
				i_296_ = (byte) 0;
			else
				i_296_ = class133_sub2.aByteArray3541[i_294_];
			short i_297_;
			if (aShortArray4984 == null)
				i_297_ = (short) -1;
			else
				i_297_ = aShortArray4984[i_294_];
			if (i_296_ == -2)
				i_295_ = (byte) 3;
			if (i_296_ == -1)
				i_295_ = (byte) 2;
			if (i_297_ == -1) {
				if (i_295_ == 0) {
					int i_298_ = class133_sub2.aShortArray3533[i_294_] & 0xffff;
					Class89 class89;
					if (class133_sub2.aClass89Array3515 != null
							&& (class133_sub2.aClass89Array3515[triangleVertexA[i_294_]]) != null)
						class89 = (class133_sub2.aClass89Array3515[triangleVertexA[i_294_]]);
					else
						class89 = (class133_sub2.aClass89Array3552[triangleVertexA[i_294_]]);
					int i_299_ = i
							+ ((i_282_ * class89.anInt1414 + i_283_ * class89.anInt1404 + i_284_ * class89.anInt1406)
									/ (i_286_ * class89.anInt1410));
					anIntArray4957[i_294_] = blendColours(i_298_, i_299_);
					if (class133_sub2.aClass89Array3515 != null
							&& (class133_sub2.aClass89Array3515[triangleVertexB[i_294_]]) != null)
						class89 = (class133_sub2.aClass89Array3515[triangleVertexB[i_294_]]);
					else
						class89 = (class133_sub2.aClass89Array3552[triangleVertexB[i_294_]]);
					i_299_ = i + ((i_282_ * class89.anInt1414 + i_283_ * class89.anInt1404 + i_284_ * class89.anInt1406)
							/ (i_286_ * class89.anInt1410));
					anIntArray4978[i_294_] = blendColours(i_298_, i_299_);
					if (class133_sub2.aClass89Array3515 != null
							&& (class133_sub2.aClass89Array3515[triangleVertexC[i_294_]]) != null)
						class89 = (class133_sub2.aClass89Array3515[triangleVertexC[i_294_]]);
					else
						class89 = (class133_sub2.aClass89Array3552[triangleVertexC[i_294_]]);
					i_299_ = i + ((i_282_ * class89.anInt1414 + i_283_ * class89.anInt1404 + i_284_ * class89.anInt1406)
							/ (i_286_ * class89.anInt1410));
					triangleInfo[i_294_] = blendColours(i_298_, i_299_);
				} else if (i_295_ == 1) {
					Class138 class138 = class133_sub2.aClass138Array3536[i_294_];
					int i_300_ = i
							+ ((i_282_ * class138.anInt2208 + i_283_ * class138.anInt2217 + i_284_ * class138.anInt2209)
									/ (i_286_ + i_286_ / 2));
					anIntArray4957[i_294_] = blendColours((class133_sub2.aShortArray3533[i_294_] & 0xffff), i_300_);
					triangleInfo[i_294_] = -1;
				} else if (i_295_ == 3) {
					anIntArray4957[i_294_] = 128;
					triangleInfo[i_294_] = -1;
				} else
					triangleInfo[i_294_] = -2;
			} else if (i_295_ == 0) {
				Class89 class89;
				if (class133_sub2.aClass89Array3515 != null
						&& (class133_sub2.aClass89Array3515[triangleVertexA[i_294_]]) != null)
					class89 = (class133_sub2.aClass89Array3515[triangleVertexA[i_294_]]);
				else
					class89 = (class133_sub2.aClass89Array3552[triangleVertexA[i_294_]]);
				int i_301_ = i + ((i_282_ * class89.anInt1414 + i_283_ * class89.anInt1404 + i_284_ * class89.anInt1406)
						/ (i_286_ * class89.anInt1410));
				anIntArray4957[i_294_] = method1881(i_301_);
				if (class133_sub2.aClass89Array3515 != null
						&& (class133_sub2.aClass89Array3515[triangleVertexB[i_294_]]) != null)
					class89 = (class133_sub2.aClass89Array3515[triangleVertexB[i_294_]]);
				else
					class89 = (class133_sub2.aClass89Array3552[triangleVertexB[i_294_]]);
				i_301_ = i + ((i_282_ * class89.anInt1414 + i_283_ * class89.anInt1404 + i_284_ * class89.anInt1406)
						/ (i_286_ * class89.anInt1410));
				anIntArray4978[i_294_] = method1881(i_301_);
				if (class133_sub2.aClass89Array3515 != null
						&& (class133_sub2.aClass89Array3515[triangleVertexC[i_294_]]) != null)
					class89 = (class133_sub2.aClass89Array3515[triangleVertexC[i_294_]]);
				else
					class89 = (class133_sub2.aClass89Array3552[triangleVertexC[i_294_]]);
				i_301_ = i + ((i_282_ * class89.anInt1414 + i_283_ * class89.anInt1404 + i_284_ * class89.anInt1406)
						/ (i_286_ * class89.anInt1410));
				triangleInfo[i_294_] = method1881(i_301_);
			} else if (i_295_ == 1) {
				Class138 class138 = class133_sub2.aClass138Array3536[i_294_];
				int i_302_ = i
						+ ((i_282_ * class138.anInt2208 + i_283_ * class138.anInt2217 + i_284_ * class138.anInt2209)
								/ (i_286_ + i_286_ / 2));
				anIntArray4957[i_294_] = method1881(i_302_);
				triangleInfo[i_294_] = -1;
			} else
				triangleInfo[i_294_] = -2;
		}
	}
}
