import subprocess
import os

def get_image_metadata(image_path):
    try:
        result = subprocess.run(["exiftool", image_path], capture_output=True, text=True, check=True)
        exif_data = result.stdout
        return exif_data
    except subprocess.CalledProcessError as e:
        print(f"Error while reading image metadata: {e}")
        return None
        print(f"Error while reading image metadata: {e}")
        return None

def print_image_metadata(img_path):
    metadata = get_image_metadata(img_path)
    if metadata:
        print("Image Metadata:")
        print(metadata)

if __name__ == '__main__':
    # You can test the function here
    image_path = os.path.join(os.path.dirname(os.path.abspath(__file__)), '../samplerTool/imgFiles/testimg.jpg')
    print_image_metadata(image_path)
